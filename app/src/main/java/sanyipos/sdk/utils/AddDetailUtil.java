package sanyipos.sdk.utils;


import java.util.ArrayList;
import java.util.List;

import sanyipos.sdk.model.OrderDetail;
import sanyipos.sdk.model.scala.addDetail.model.AddDetaiAction;
import sanyipos.sdk.model.scala.addDetail.model.Detail;

public class AddDetailUtil {

    public static AddDetaiAction addDetail(int actionId, OrderDetail order) {
        if (order != null) {
            AddDetaiAction addDetailAction = new AddDetaiAction();
            addDetailAction.setAction(AddDetaiAction.getActionById(actionId));
            if (actionId == AddDetaiAction.ACTION_ADD) {
                addDetailAction.setAuthStaff(1);
            } else {
                addDetailAction.setAuthStaff(order.getAuth_staff_id());
            }

            addDetailAction.setCount(order.getQuantity() * order.getUnitCount());
            addDetailAction.setWeight(order.getWeight());
            addDetailAction.setPrice(order.getCurrentPrice());
            addDetailAction.setRemark(order.getRemark());
            return addDetailAction;
        }
        return null;
    }

    public static Detail newDetail(OrderDetail orderDetail, long tag, int action) {
        Detail detail = new Detail();
        detail.setGoodsId(orderDetail.getGoodsId());
        detail.setProductId(orderDetail.getProductId());
        detail.setTag(tag++);
        orderDetail.setTag(detail.getTag());
        detail.actions.add(addDetail(action, orderDetail));
        if (orderDetail.isFree()) {
            detail.actions.add(addDetail(AddDetaiAction.ACTION_GIFT, orderDetail));
        }
        if (orderDetail.isPriceChanged() || orderDetail.isMarket()) {
            detail.actions.add(addDetail(AddDetaiAction.ACTION_CHANGEPRICE, orderDetail));
        }
        if (orderDetail.isHold()) {
            detail.actions.add(addDetail(AddDetaiAction.ACTION_HOLD, orderDetail));
        }
        if (orderDetail.getIngredient().size() > 0) {
            List<Detail> ingredients = new ArrayList<Detail>();
            for (int j = 0; j < orderDetail.getIngredient().size(); j++) {
                OrderDetail ingredientOrder = orderDetail.getIngredient().get(j);
                Detail ingredientDetail = newDetail(ingredientOrder, tag++, AddDetaiAction.ACTION_ADD);
                ingredients.add(ingredientDetail);
            }
            detail.children.addAll(ingredients);
        }
        if (orderDetail.getPublicCookMethod().size() > 0) {
            List<Detail> cooks = new ArrayList<Detail>();
            for (int k = 0; k < orderDetail.getPublicCookMethod().size(); k++) {
                OrderDetail cookOrder = orderDetail.getPublicCookMethod().get(k);
                Detail cookDetail = newDetail(cookOrder, tag++, AddDetaiAction.ACTION_ADD);
                cooks.add(cookDetail);
            }
            detail.children.addAll(cooks);
        }
        if (orderDetail.getPrivateCookMethod().size() > 0) {
            List<Detail> privateCooks = new ArrayList<Detail>();
            for (int m = 0; m < orderDetail.getPrivateCookMethod().size(); m++) {
                OrderDetail cookOrder = orderDetail.getPrivateCookMethod().get(m);
                Detail cookDetail = newDetail(cookOrder, tag++, AddDetaiAction.ACTION_ADD);
                privateCooks.add(cookDetail);
            }
            detail.children.addAll(privateCooks);
        }
        if (orderDetail.getSetOrderDetailList().size() > 0) {
            for (int l = 0; l < orderDetail.getSetOrderDetailList().size(); l++) {
                OrderDetail setOrder = orderDetail.getSetOrderDetailList().get(l);
                Detail setDetail = newDetail(setOrder, tag++, AddDetaiAction.ACTION_ADD);
                detail.children.add(setDetail);
            }
        }
        return detail;

    }
}
