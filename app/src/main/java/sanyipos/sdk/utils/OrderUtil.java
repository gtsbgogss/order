package sanyipos.sdk.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sanyipos.sdk.model.OrderDetail;
import sanyipos.sdk.model.rest.GoodsSet;
import sanyipos.sdk.model.rest.ProductRest;
import sanyipos.sdk.model.scala.DetailOpGroupList;
import sanyipos.sdk.model.scala.DetailOpResult;
import sanyipos.sdk.model.scala.addDetail.model.AddDetailDetails;

/**
 * 菜品转换工具
 *
 * @author ming.cheng
 * @date 2015/07/30
 */
public class OrderUtil {

    public static final int ORDER_CHILD_ITEM_FLAG_INGREDIENT = 1 << 0;// flag :
    // 0000
    // 0000
    // 0000
    // 0001
    public static final int ORDER_CHILD_ITEM_FLAG_GIFT = 1 << 1;// flag : 0000
    // 0000 0000
    // 0010
    public static final int ORDER_CHILD_ITEM_FLAG_SET = 1 << 2;// flag : 0000
    // 0000 0000
    // 0100

    public static final int ORDER_CHILD_ITEM_FLAG_PUBLIC_COOK = 1 << 3;

    public static DecimalFormat decimalFormatter = new DecimalFormat("0.00");
    public static DecimalFormat dishPriceFormatter = new DecimalFormat("￥0.00");

    public static double getOrderTotal(List<OrderDetail> orderDetailList, int childItemFlags) {
        double total = 0;
        for (int i = 0; i < orderDetailList.size(); i++) {
            OrderDetail orderDetail = orderDetailList.get(i);
            total += getOrderDetailPrice(orderDetail, childItemFlags);
        }
        return total;
    }

    /**
     * 获取单个产品金额
     *
     * @param orderDetail
     * @param childItemFlags
     * @return
     */
    public static double getOrderDetailTotal(OrderDetail orderDetail,
                                             int childItemFlags) {
        double total = 0.0;
        if (orderDetail.isFree()) {
            return total;
        }
        if (orderDetail.isWeight()) {
            total = total
                    + (orderDetail.getCurrentPrice() * orderDetail.getWeight() * (orderDetail
                    .getQuantity() - orderDetail.getVoid_quantity()));
        } else {
            total = total
                    + orderDetail.getCurrentPrice()
                    * (orderDetail.getQuantity() - orderDetail
                    .getVoid_quantity());
        }

        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_INGREDIENT) > 0) {
            for (OrderDetail ingridient : orderDetail.getIngredient()) {
                total = total
                        + ingridient.getCurrentPrice()
                        * (ingridient.getQuantity() - ingridient
                        .getVoid_quantity());
            }
        }
        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_GIFT) > 0) {
            for (OrderDetail gift : orderDetail.getGiftOrders()) {
                total = total + gift.getCurrentPrice()
                        * (gift.getQuantity() - gift.getVoid_quantity());
            }
        }
        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_PUBLIC_COOK) > 0) {
            for (OrderDetail cook : orderDetail.getPublicCookMethod()) {
                total = total + cook.getCurrentPrice()
                        * (cook.getQuantity() - cook.getVoid_quantity());
            }
            for (OrderDetail cook : orderDetail.getPrivateCookMethod()) {
                total = total + cook.getCurrentPrice()
                        * (cook.getQuantity() - cook.getVoid_quantity());
            }
        }
        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_SET) > 0) {
            for (OrderDetail setItem : orderDetail.getSetOrderDetailList()) {
                total = total + setItem.getCurrentPrice()
                        * (setItem.getQuantity() - setItem.getVoid_quantity());
                if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_INGREDIENT) > 0) {
                    for (OrderDetail ingridient : setItem.getIngredient()) {
                        total = total
                                + ingridient.getCurrentPrice()
                                * (ingridient.getQuantity() - ingridient
                                .getVoid_quantity());
                    }
                }
                if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_PUBLIC_COOK) > 0) {
                    for (OrderDetail cook : setItem.getPublicCookMethod()) {
                        total = total
                                + cook.getCurrentPrice()
                                * (cook.getQuantity() - cook.getVoid_quantity());
                    }
                    for (OrderDetail cook : setItem.getPrivateCookMethod()) {
                        total = total
                                + cook.getCurrentPrice()
                                * (cook.getQuantity() - cook.getVoid_quantity());
                    }
                }
            }
        }
        return total;
    }

    /**
     * 获取一个orderdetail里单份菜品的价格
     *
     * @param orderDetail
     * @param childItemFlags
     * @return
     */
    public static double getOrderDetailPrice(OrderDetail orderDetail,
                                             int childItemFlags) {
        double total = 0.0;
        if (orderDetail.isFree()) {
            return total;
        }
        if (orderDetail.isWeight()) {
            total = total
                    + (orderDetail.getCurrentPrice() * orderDetail.getWeight() * (orderDetail
                    .getQuantity() - orderDetail.getVoid_quantity()));
        } else {
            total = total
                    + orderDetail.getCurrentPrice()
                    * (orderDetail.getQuantity() - orderDetail
                    .getVoid_quantity());
        }


        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_INGREDIENT) > 0) {
            for (OrderDetail ingridient : orderDetail.getIngredient()) {
                total = total
                        + ingridient.getCurrentPrice() * ingridient.getUnitCount() * (orderDetail.getQuantity() - orderDetail.getVoid_quantity());
            }
        }
        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_PUBLIC_COOK) > 0) {
            for (OrderDetail cook : orderDetail.getPublicCookMethod()) {
                total = total + cook.getCurrentPrice() * (orderDetail.getQuantity() - orderDetail.getVoid_quantity());
            }
            for (OrderDetail privateCood : orderDetail.getPrivateCookMethod()) {
                total = total + privateCood.getCurrentPrice() * (orderDetail.getQuantity() - orderDetail.getVoid_quantity());
            }
        }
        if ((childItemFlags & ORDER_CHILD_ITEM_FLAG_SET) > 0) {
            for (OrderDetail setItem : orderDetail.getSetOrderDetailList()) {
                total += getOrderDetailPrice(setItem, childItemFlags);
            }
        }
        return total;
    }

    /**
     * 获取菜品数量
     *
     * @param orderDetailList
     * @return
     */
    public static int getOrderCount(List<OrderDetail> orderDetailList) {
        int total = 0;
        for (int i = 0; i < orderDetailList.size(); i++) {
            OrderDetail order = orderDetailList.get(i);
            total = total + (order.getQuantity() - order.getVoid_quantity());
            for (int j = 0; j < order.getGiftOrders().size(); j++) {
                OrderDetail giftOrder = order.getGiftOrders().get(j);
                total = total
                        + (giftOrder.getQuantity() - giftOrder
                        .getVoid_quantity());
            }
        }
        return total;
    }

    /**
     * 创建一个order detail(已经包含处理套餐)
     *
     * @param dish
     * @param quantity
     * @return
     */
    public static OrderDetail createOrderDetail(ProductRest dish, int quantity) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setName(dish.name);
        orderDetail.setProductId(dish.id);
        orderDetail.setGoodsId(dish.goods);

        orderDetail.setOriginPrice(dish.originPrice);
        orderDetail
                .setCurrentPrice(dish.getProductType().isIsSpecial() ? dish.originPrice
                        : dish.price);
        orderDetail.setRealCurrentPrice(dish.getProductType().isIsSpecial() ? dish.originPrice
                : dish.price);
        orderDetail.setIsSpecial(dish.getProductType().isIsSpecial());
        orderDetail.setIsWeight(dish.getProductType().isIsWeight());

        orderDetail.setUnitName(dish.unitName);
        orderDetail.setQuantity(quantity);
        orderDetail.setSet(dish.getProductType().isIsSet());
        orderDetail.setSubGroupId(dish.subgroup);
        orderDetail.setCooking(dish.getProductType().isIsCooking());
        orderDetail.setMarket(dish.getProductType().isIsMarket());
        orderDetail.isMultiUnitProduct = dish.isMultiUnitProduct;
        // 套餐处理
        if (dish.getProductType().isIsSet()) {
            GoodsSet goodsSetItem = getGoodsSet(dish);

            List<OrderDetail> setOrderDetails = new ArrayList<OrderDetail>();
            if (goodsSetItem != null && goodsSetItem.getItems().size() > 0) {
                for (GoodsSet.SetItems goodsetitem : goodsSetItem.getItems()) {

                    // 找到当前所有可以替换的道菜
                    List<GoodsSet.SetItems.SetItemDetails> replaceable_details = goodsetitem
                            .getDetails();

                    if (replaceable_details.size() <= 0) {
                        continue; // 该道菜分类中没有道菜,跳过
                    }

                    // 从可替换菜品中选出默认菜品，如果没有默认菜品就选择一个
                    GoodsSet.SetItems.SetItemDetails defaultItem = null;
                    int index = 0;
                    for (int j = 0; j < replaceable_details.size(); j++) {
                        GoodsSet.SetItems.SetItemDetails detail = replaceable_details.get(j);
                        if (detail.isIsDefault()) {
                            defaultItem = detail;
                            index = j;
                            break;
                        }
                    }
                    if (defaultItem == null) {
                        defaultItem = replaceable_details.get(0);
                        index = 0;
                    }
                    OrderDetail order = createSetOrderDetail(defaultItem, index);
                    order.setParent(orderDetail);
                    setOrderDetails.add(order);
                }
            }

            orderDetail.setOrders = setOrderDetails;
        }

        return orderDetail;
    }

    /**
     * 根据当前套餐Product，获取这个套餐所有的详细内容，比如道菜和可选道菜
     *
     * @param product
     * @return
     */
    public static GoodsSet getGoodsSet(ProductRest product) {
        if (product == null)
            return null;
//        for (int i = 0; i < SanyiSDK.rest.goodsSets.size(); i++) {
//            GoodsSet temp = SanyiSDK.rest.goodsSets.get(i);
//            if (temp.getProduct().getGoods() == product.getGoods()
//                    && temp.getProduct().getId() == product.getId()) {
//                return temp;
//            }
//        }
        return null;
    }

    /**
     * 创建一个套餐的OrderDetail
     *
     * @param detail
     * @param childOrderIndex
     * @return
     */
    public static OrderDetail createSetOrderDetail(GoodsSet.SetItems.SetItemDetails detail,
                                                   long childOrderIndex) {
        OrderDetail setOrder = new OrderDetail();

        replaceGoodsItemDetail(setOrder, detail);

        setOrder.setOrder_id(childOrderIndex); // 道菜索引
        return setOrder;
    }

    /**
     * 替换掉道菜orderdetail中的道菜明细 注意：道菜没有productid
     *
     * @param setOrder
     * @param detail
     */
    public static void replaceGoodsItemDetail(OrderDetail setOrder,
                                              GoodsSet.SetItems.SetItemDetails detail) {
        if (setOrder == null || detail == null)
            return;
        setOrder.setName(detail.getName());

        setOrder.setOriginPrice(detail.getPlusPrice());
        setOrder.setGoodsId((int) detail.getGoods());
        setOrder.setCurrentPrice(detail.getPlusPrice());
        setOrder.setQuantity((int) detail.getQuantity());
        setOrder.isMultiUnitProduct = detail.isMulti();
        setOrder.setUnitName(detail.getUnitTypeName());
        setOrder.setFree(setOrder.isFree());
    }

    /**
     * AddDetailDetails ——> OrderDetail<br>
     * 单纯只转换一个个体，只转自己，不管自己的子菜
     *
     * @param ads
     * @return
     */
    private static OrderDetail convertToOrderDetail(AddDetailDetails ads) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(ads.orderDetailId);
        orderDetail.setOrder_id(ads.orderId);
        orderDetail.setGoodsId(ads.goodsId);
        orderDetail.setName(ads.goodsName);
        orderDetail.setProductId(ads.productId == null ? -1 : ads.productId);
        orderDetail.setCurrentPrice(ads.currentPrice);
        orderDetail.setOriginPrice(ads.originPrice);
        orderDetail.setCount(ads.count - ads.returnCount);
        orderDetail.setQuantity(ads.count);
        orderDetail.setVoid_quantity(ads.returnCount);
        orderDetail.setWeight(ads.weight);
        orderDetail.setFree(ads.status.isGift);
        orderDetail.setUnitName(ads.unitTypeName);
        orderDetail.setRealPrice(ads.realValue);
        orderDetail.setSubValue(ads.subValue);
        orderDetail.setRealCurrentPrice(ads.realCurrentPrice);
        orderDetail.setPriceChanged(ads.status.isPriceChanged);
        orderDetail.setPlaced(true);
        orderDetail.setFree(ads.status.isGift);
        orderDetail.setMarket(ads.status.isMarket);
        orderDetail.setPriceChanged(ads.status.isPriceChanged);
        orderDetail.setIsSpecial(ads.status.isSpecial);
        orderDetail.setCooking(ads.status.isCooking);
        orderDetail.setHold(ads.status.isHold);
        orderDetail.setIngredient(ads.status.isIngredient);
        orderDetail.setSet(ads.status.isSet);
        orderDetail.setVip(ads.status.isVip);
        orderDetail.setVoucher(ads.status.isVoucher);
        orderDetail.setRemark(ads.remark);
        if (ads.status.isSetItem) {
            if (null != ads.goodsId) {
//                GoodsSet.SetItems.SetItemDetails setItemDetails = SanyiSDK.rest.getSetItemByGoodsId(ads.goodsId);
//                if (null != setItemDetails) {
//                    orderDetail.isMultiUnitProduct = setItemDetails.isMulti();
//                }
            }
        } else {
            if (null != ads.productId) {
//                ProductRest productRest = SanyiSDK.rest.getProductById(orderDetail.getProductId());
//                if (null != productRest) {
//                    orderDetail.isMultiUnitProduct = productRest.isMultiUnitProduct;
//                }
            }
        }
        if (ads.status.isReturn) {

        }
        orderDetail.setDiscount(ads.status.isDiscount);
        orderDetail.setIsWeight(ads.status.isWeight);
        return orderDetail;
    }

    /**
     * AddDetailDetails ——> OrderDetail<br>
     * 完整转换，转换主菜中所有的内容
     *
     * @param detailOrder
     * @return
     */
    public static OrderDetail AddDetailDetails2OrderDetail(
            AddDetailDetails detailOrder) {
        // 转换主菜
        OrderDetail orderDetail = convertToOrderDetail(detailOrder);

        // 如果主菜是套餐
        if (detailOrder.productType.intValue() == ConstantsUtil.PRODUCT_TYPE_SET) {
            // 子菜只能是道菜
            for (int i = 0; i < detailOrder.children.size(); i++) {
                OrderDetail _child = convertToOrderDetail(detailOrder.children
                        .get(i));
                _child.setSetItemId(i + 1);
                _child.setParent(orderDetail);
                // 找出子菜的做法和加料
                for (AddDetailDetails child_cook_ing : detailOrder.children
                        .get(i).children) {
                    OrderDetail __child = convertToOrderDetail(child_cook_ing);
                    int ptype = child_cook_ing.productType.intValue();
                    switch (ptype) {
                        case ConstantsUtil.PRODUCT_TYPE_COOKMETHOD:
                            // 找出做法
                            _child.publicCookMethod.add(__child);
                            break;
                        case ConstantsUtil.PRODUCT_TYPE_INGREDIENT:
                            // 找出加料
                            // 计算出每份的数量
                            int quantity = _child.getQuantity()
                                    - _child.getVoid_quantity();
                            if (quantity > 0) {
                                int unitCount = (__child.getQuantity() - __child
                                        .getVoid_quantity()) / (quantity);

                                __child.setUnitCount(unitCount);
                            }
                            _child.ingredients.add(__child);
                            break;
                    }
                }
                orderDetail.setOrders.add(_child);
            }

        } else {
            // 子菜只能是做法和加料
            for (AddDetailDetails child : detailOrder.children) {
                OrderDetail _child = convertToOrderDetail(child);
                int ptype = child.productType.intValue();
                switch (ptype) {
                    case ConstantsUtil.PRODUCT_TYPE_COOKMETHOD:
                        // 找出做法
                        orderDetail.publicCookMethod.add(_child);
                        break;
                    case ConstantsUtil.PRODUCT_TYPE_INGREDIENT:
                        // 找出加料
                        // 计算出每份的数量
                        int quantity = orderDetail.getQuantity()
                                - orderDetail.getVoid_quantity();
                        if (quantity > 0) {
                            int unitCount = (_child.getQuantity() - _child
                                    .getVoid_quantity()) / (quantity);
                            _child.setUnitCount(unitCount);
                        }
                        orderDetail.ingredients.add(_child);
                        break;
                }
            }
        }
        return orderDetail;
    }

    /**
     * DetailOpResult 转换成  DetailOpGroupList
     *
     * @param result
     * @return
     */
    public static DetailOpGroupList convertToDetailOpGroupList(DetailOpResult result) {
        DetailOpGroupList detailOpGroupList = new DetailOpGroupList();
        List<DetailOpGroupList.DetailOpChildList> childLists = new ArrayList<DetailOpGroupList.DetailOpChildList>();
        List<Long> detailIds = getDetailIdList(result.logs);
        for (Long detailId : detailIds) {
            DetailOpGroupList.DetailOpChildList detailOpChildList = new DetailOpGroupList.DetailOpChildList();
            detailOpChildList.detail = detailId;
            detailOpChildList.detailLogs = getDetailLogList(detailId, result.logs);
            detailOpChildList.name = detailOpChildList.detailLogs.get(0).detailName;
            childLists.add(detailOpChildList);
        }
        detailOpGroupList.childList = childLists;
        return detailOpGroupList;
    }

    /**
     * 获取所有操作菜品detailid
     *
     * @param result
     * @return
     */
    private static List<Long> getDetailIdList(List<DetailOpResult.DetailLog> allDetailLogs) {
        List<Long> detailIds = new ArrayList<Long>();
        for (DetailOpResult.DetailLog detailLog : allDetailLogs) {
            if (!detailIds.contains(detailLog.detail)) {
                detailIds.add(detailLog.detail);
            }
        }
        return detailIds;
    }

    /**
     * 通过菜品Id找到菜品所有操作
     *
     * @param detailId
     * @param allDetailLogs
     * @return
     */
    private static List<DetailOpResult.DetailLog> getDetailLogList(Long detailId, List<DetailOpResult.DetailLog> allDetailLogs) {
        List<DetailOpResult.DetailLog> detailLogs = new ArrayList<DetailOpResult.DetailLog>();
        for (DetailOpResult.DetailLog detailLog : allDetailLogs) {
            if (detailId.equals(detailLog.detail)) {
                detailLogs.add(detailLog);
            }
        }
        Collections.sort(detailLogs, new Comparator<DetailOpResult.DetailLog>() {

            @SuppressWarnings("finally")
            @Override
            public int compare(DetailOpResult.DetailLog o1, DetailOpResult.DetailLog o2) {
                int flag = 0;
                try {
                    if (o1.createon.getTime() > o2.createon.getTime()) {
                        flag = -1;
                    } else {
                        flag = 1;
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    return flag;
                }

            }
        });
        return detailLogs;
    }

    private static Long formatTime(String time) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(time).getTime();
    }
}