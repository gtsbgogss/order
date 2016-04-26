package sanyipos.sdk.model;

import java.util.ArrayList;
import java.util.List;

public class OrderDetail {

    public static int ORDER_STATE_HOLD = 110;
    public static int ORDER_STATE_COOK = 111;
    public static int ORDER_STATE_READY = 112;

    private long product_id;
    private long subGroupId;
    private long goods_id;

    private double origin_price;
    private double current_price;
    private double discount_value = 0;
    private double realPrice;
    private double subValue;
    public double realCurrentPrice;

    private int quantity;
    private int number_of_reminding;
    private long staff_id;
    private long order_id;
    private long coupon_id = -1;
    private int saler_staff_id;
    private java.util.Date order_time;
    private java.util.Date ready_time;
    private double discount_percentage = 100;
    private int void_quantity = 0;
    private String barcode = "";
    private String qrcode = "";
    private String remark = "";
    private long id;
    private int count;
    private String name;
    private int sort_order;
    private boolean placed = false;
    private boolean isFree = false;
    private boolean isSet = false;
    private boolean isWeight = false;
    private boolean isCooking = false;
    private boolean isHold = false;
    private boolean isPriceChanged = false;

    private String unitName;
    private double weight = 1;

    // private Order parentOrder;
    private int setItemId = 0;
    private long tableSeatId = -1;
    private boolean isSpecial = false;
    private long promotionId = -1;
    private boolean isIngredient = false;
    private boolean isMarket = false;
    private int unitCount = 1;
    public long auth_staff_id = -1;
    public long tag;
    public boolean isDiscount = false;
    public boolean isVip = false;
    public boolean isVoucher = false;

    public boolean isMultiUnitProduct = false; // 是否是多规格类型的菜品


    public boolean isVoucher() {
        return isVoucher;
    }

    public void setVoucher(boolean isVoucher) {
        this.isVoucher = isVoucher;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public double getRealCurrentPrice() {
        return realCurrentPrice;
    }

    public void setRealCurrentPrice(double realCurrentPrice) {
        this.realCurrentPrice = realCurrentPrice;
    }

    /**
     * 将自己拷贝到目标对象上去
     *
     * @param od
     */
    public void copyTo(OrderDetail od) {
        od.setProductId(this.product_id);
        od.setGoodsId(this.goods_id);
        od.setId(this.id);
        od.setOriginPrice(this.origin_price);
        od.setCurrentPrice(this.current_price);
        od.setQuantity(this.quantity);
        od.setNumber_of_reminding(this.number_of_reminding);
        od.setStaff_id(this.staff_id);
        od.setOrder_id(this.order_id);
        od.setCouponId(this.coupon_id);
        od.setSaler_staff_id(this.saler_staff_id);
        od.setOrder_time(this.order_time);
        od.setReady_time(this.ready_time);
        od.setVoid_quantity(this.void_quantity);
        od.setBarcode(this.barcode);
        od.setQrcode(this.qrcode);
        od.setCount(this.count);
        od.setName(this.name);
        od.setSortOrder(this.sort_order);
        od.setPlaced(this.placed);
        od.setFree(this.isFree);
        od.setSet(this.isSet);
        od.setIsWeight(this.isWeight);
        od.setCooking(this.isCooking);
        od.setPriceChanged(this.isPriceChanged);
        od.setUnitName(this.unitName);
        od.setWeight(this.weight);
        // od.setParentOrder(this.parentOrder);
        od.setTableSeatId(this.tableSeatId);
        od.setSetItemId(this.setItemId);
        od.setIsSpecial(this.isSpecial);
        od.setPromotionId(this.promotionId);
        od.setIngredient(this.isIngredient);
        od.setMarket(this.isMarket);
        od.setUnitCount(this.unitCount);
        od.setAuth_staff_id(this.auth_staff_id);
        od.setTag(this.tag);
        od.setVip(this.isVip);
        od.setVoucher(this.isVoucher);
        od.setRealCurrentPrice(this.realCurrentPrice);
    }

    /**
     * 将目标对象拷贝到自己上去
     *
     * @param od
     */
    public void copyFrom(OrderDetail od) {
        setProductId(od.product_id);
        setGoodsId(od.goods_id);
        setId(od.id);
        setOriginPrice(od.origin_price);
        setCurrentPrice(od.current_price);
        setQuantity(od.quantity);
        setNumber_of_reminding(od.number_of_reminding);
        setStaff_id(od.staff_id);
        setOrder_id(od.order_id);
        setCouponId(od.coupon_id);
        setSaler_staff_id(od.saler_staff_id);
        setOrder_time(od.order_time);
        setReady_time(od.ready_time);
        setVoid_quantity(od.void_quantity);
        setBarcode(od.barcode);
        setQrcode(od.qrcode);
        setCount(od.count);
        setName(od.name);
        setSortOrder(od.sort_order);
        setPlaced(od.placed);
        setFree(od.isFree);
        setSet(od.isSet);
        setIsWeight(od.isWeight);
        setCooking(od.isCooking);
        setPriceChanged(od.isPriceChanged);
        setUnitName(od.unitName);
        setWeight(od.weight);
        // setParentOrder(od.parentOrder);
        setTableSeatId(od.tableSeatId);
        setSetItemId(od.setItemId);
        setIsSpecial(od.isSpecial);
        setPromotionId(od.promotionId);
        setIngredient(od.isIngredient);
        setMarket(od.isMarket);
        setUnitCount(od.unitCount);
        setAuth_staff_id(od.auth_staff_id);
        setTag(od.tag);
        setVip(od.isVip);
        setVoucher(od.isVoucher);
        setRealCurrentPrice(od.realCurrentPrice);
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }

    public boolean isMarket() {
        return isMarket;
    }

    public void setMarket(boolean isMarket) {
        this.isMarket = isMarket;
    }

    public boolean isPriceChanged() {
        return isPriceChanged;
    }

    public void setPriceChanged(boolean isPriceChanged) {
        this.isPriceChanged = isPriceChanged;
    }

    public long getTag() {
        return tag;
    }

    public void setTag(long tag) {
        this.tag = tag;
    }

    public long getAuth_staff_id() {
        return auth_staff_id;
    }

    public void setAuth_staff_id(long auth_staff_id) {
        this.auth_staff_id = auth_staff_id;
    }

    public List<OrderDetail> ingredients = new ArrayList<OrderDetail>();
    public List<OrderDetail> giftOrders = new ArrayList<OrderDetail>();
    public List<OrderDetail> setOrders = new ArrayList<OrderDetail>();
    public List<OrderDetail> publicCookMethod = new ArrayList<OrderDetail>();
    public List<OrderDetail> privateCookMethod = new ArrayList<OrderDetail>();
    private OrderDetail parent = null;

    public long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(long promotionId) {
        this.promotionId = promotionId;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    // public Order getParentOrder() {
    // return parentOrder;
    // }
    //
    // public void setParentOrder(Order parentOrder) {
    // this.parentOrder = parentOrder;
    // }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public long getGoodsId() {
        return goods_id;
    }

    public void setGoodsId(long goods_id) {
        this.goods_id = goods_id;
    }

    public boolean isWeight() {
        return isWeight;
    }

    public void setIsWeight(boolean isWeight) {
        this.isWeight = isWeight;
    }

    public boolean isCooking() {
        return isCooking;
    }

    public void setCooking(boolean isCooking) {
        this.isCooking = isCooking;
    }

    public long getTableSeatId() {
        return tableSeatId;
    }

    /**
     * @return the coupon_id
     */
    public long getCouponId() {
        return coupon_id;
    }

    /**
     * @param coupon_id the coupon_id to set
     */
    public void setCouponId(long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public void setTableSeatId(long tableSeatId) {
        this.tableSeatId = tableSeatId;
    }

    public int getSetItemId() {
        return setItemId;
    }

    public void setSetItemId(int setItemId) {
        this.setItemId = setItemId;
    }

    public OrderDetail getParent() {
        return parent;
    }

    public void setParent(OrderDetail parent) {
        this.parent = parent;
    }

    public boolean isFree() {
        return isFree;
    }


    public void setSet(boolean isSet) {
        this.isSet = isSet;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setIngredient(boolean isIngredient) {
        this.isIngredient = isIngredient;
    }

    public boolean isIngredient() {
        return isIngredient;
    }

    public void setFree(boolean isFree) {
        this.isFree = isFree;
        for (OrderDetail cook : publicCookMethod) {
            cook.setFree(isFree);
            cook.setAuth_staff_id(auth_staff_id);
        }
        for (OrderDetail privateCood : privateCookMethod) {
            privateCood.setFree(isFree);
            privateCood.setAuth_staff_id(auth_staff_id);
        }
        for (OrderDetail ingridient : ingredients) {
            ingridient.setFree(isFree);
            ingridient.setAuth_staff_id(auth_staff_id);
        }
        if (isSet) {
            for (OrderDetail set : setOrders) {
                set.setFree(isFree);
                set.setAuth_staff_id(auth_staff_id);
                for (OrderDetail setCook : set.publicCookMethod) {
                    setCook.setAuth_staff_id(auth_staff_id);
                    setCook.setFree(isFree);
                }
                for (OrderDetail setIngridient : set.ingredients) {
                    setIngridient.setFree(isFree);
                    setIngridient.setAuth_staff_id(auth_staff_id);
                }
            }
        }
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(long subGroupId) {
        this.subGroupId = subGroupId;
    }

    public void addIngredient(OrderDetail ingredient) {
        ingredient.setAuth_staff_id(auth_staff_id);
        ingredients.add(ingredient);
        if (isFree)
            setFree(true);
    }

    public List<OrderDetail> getIngredient() {
        return ingredients;
    }

    public void addGiftOrder(OrderDetail giftOrder) {
        giftOrders.add(giftOrder);
    }

    public List<OrderDetail> getGiftOrders() {
        return giftOrders;
    }

    public void addSetOrder(OrderDetail setOrder) {
        setOrders.add(setOrder);
    }

    public List<OrderDetail> getSetOrderDetailList() {
        return setOrders;
    }

    public void clearSetOrder() {
        setOrders.clear();
    }

    public List<OrderDetail> getPublicCookMethod() {
        return publicCookMethod;
    }

    public List<OrderDetail> getPrivateCookMethod() {
        return privateCookMethod;
    }

    public void addPublicCookMethod(OrderDetail orderDetail) {
        orderDetail.setAuth_staff_id(auth_staff_id);
        publicCookMethod.add(orderDetail);
        if (isFree)
            setFree(true);
    }

    public void addPrivateCookMethod(OrderDetail orderDetail) {
        orderDetail.setAuth_staff_id(auth_staff_id);
        privateCookMethod.add(orderDetail);
        if (isFree())
            setFree(true);
    }

    public void cleanPublicCookMethod() {
        publicCookMethod.clear();
    }

    public void cleanPrivateCookMethod() {
        privateCookMethod.clear();
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }

    public int getSortOrder() {
        return sort_order;
    }

    public void setSortOrder(int sort_order) {
        this.sort_order = sort_order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getProductId() {
        return product_id;
    }

    public void setProductId(long product_id) {
        this.product_id = product_id;
    }

    public double getOriginPrice() {
        return origin_price;
    }

    public void setOriginPrice(double origin_price) {
        this.origin_price = origin_price;
    }

    public double getCurrentPrice() {
        return current_price;
    }

    public void setCurrentPrice(double current_price) {
        this.current_price = current_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setIngredientsCooksQuantity();
    }

    public void setIngredientsCooksQuantity() {
        for (OrderDetail cook : publicCookMethod) {
            cook.setQuantity(quantity);
        }
        for (OrderDetail privateCood : privateCookMethod) {
            privateCood.setQuantity(quantity);
        }
        for (OrderDetail ingredient : ingredients) {
            ingredient.setQuantity(quantity);
        }
    }

    public void setIngredientsCooksVoidQuantity() {
        if (isSet) {
            for (OrderDetail setOrder : setOrders) {
                setOrder.setVoid_quantity(setOrder.getQuantity());
                for (OrderDetail setCook : setOrder.getPublicCookMethod()) {
                    setCook.setVoid_quantity(setCook.getQuantity());
                }
                for (OrderDetail setPrivateCook : setOrder.getPrivateCookMethod()) {
                    setPrivateCook.setVoid_quantity(setPrivateCook.getQuantity());
                }
                for (OrderDetail setIngreient : setOrder.getIngredient()) {
                    setIngreient.setVoid_quantity(setIngreient.getQuantity());
                }
            }
        }
        for (OrderDetail cook : publicCookMethod) {
            cook.setVoid_quantity(void_quantity);
        }
        for (OrderDetail ingredient : ingredients) {
            ingredient.setVoid_quantity(void_quantity * ingredient.getUnitCount());
        }
        for (OrderDetail privateCook : privateCookMethod) {
            privateCook.setVoid_quantity(void_quantity);
        }
    }

    public int getNumber_of_reminding() {
        return number_of_reminding;
    }

    public void setNumber_of_reminding(int number_of_reminding) {
        this.number_of_reminding = number_of_reminding;
    }

    public long getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(long staff_id) {
        this.staff_id = staff_id;
    }

    public int getSaler_staff_id() {
        return saler_staff_id;
    }

    public void setSaler_staff_id(int saler_staff_id) {
        this.saler_staff_id = saler_staff_id;
    }

    public java.util.Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(java.util.Date order_time) {
        this.order_time = order_time;
    }

    public java.util.Date getReady_time() {
        return ready_time;
    }

    public void setReady_time(java.util.Date ready_time) {
        this.ready_time = ready_time;
    }

    public double getDiscount_percentage() {
        return discount_percentage;
    }

    public void setDiscount_percentage(double discount_percentage) {
        this.discount_percentage = discount_percentage;
        // modify current price if it is not free
        if (!isFree) {
            // discount_value = current_price - origin_price
            // *discount_percentage/100;
            discount_value = (quantity - void_quantity) * (current_price - current_price * discount_percentage / 100);
        }
    }

    public int getVoid_quantity() {
        return void_quantity;
    }

    public void setVoid_quantity(int void_quantity) {
        this.void_quantity = void_quantity;
        setIngredientsCooksVoidQuantity();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHold() {
        return isHold && isAvailable();
    }

    public void setHold(boolean isHold) {
        this.isHold = isHold;
        for (OrderDetail setDetail : setOrders) {
            setDetail.setHold(isHold);
        }
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }

    // ////////////////高级方法

    /**
     * 获取当前菜品的总花费
     *
     * @return
     */
    public double getAmount() {
        double amount = 0;

        if (isFree)
            return amount;

        if (isWeight) {
            amount = this.current_price * ((this.quantity - this.void_quantity) * this.weight) * this.discount_percentage / 100;
        } else {
            amount = this.current_price * (this.quantity - this.void_quantity) * this.discount_percentage / 100;
        }

        return amount;
    }

    public double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(double realPrice) {
        this.realPrice = realPrice;
    }

    public double getSubValue() {
        return subValue;
    }

    public void setSubValue(double subValue) {
        this.subValue = subValue;
    }

    public boolean isAvailable() {
        if (getQuantity() - getVoid_quantity() > 0) {
            return true;
        }
        return false;
    }
}
