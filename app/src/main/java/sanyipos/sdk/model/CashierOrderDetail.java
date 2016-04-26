package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class CashierOrderDetail {

	public CashierOrderDetail() {
	}

	public void copy(CashierOrderDetail bean) {
		if (bean != null) {
			bean.weight = weight;
			bean.originPrice = originPrice;
			bean.productId = productId;
			bean.readyTime = readyTime;
			bean.remark = remark;
			bean.isPrint = isPrint;
			bean.currentPrice = currentPrice;
			bean.couponId = couponId;
			bean.staffId = staffId;
			bean.orderId = orderId;
			bean.id = id;
			bean.stateId = stateId;
			bean.orderTime = orderTime;
			bean.oid = oid;
			bean.quantity = quantity;
			bean.isSpecial = isSpecial;
			bean.discountPercentage = discountPercentage;
			bean.sn = sn;
			bean.shopId = shopId;
			bean.createOn = createOn;
			bean.voidQuantity = voidQuantity;
			bean.parentOrderDetailId = parentOrderDetailId;
			bean.goodsId = goodsId;
			bean.numberOfReminding = numberOfReminding;
			bean.billId = billId;
			bean.salesStaffId = salesStaffId;
			bean.isFree = isFree;
			bean.authStaffId = authStaffId;
		}
	}

	public String toString() {
		return "\n[cashier_order_detail]\n " + "- weight = " + weight + "- originPrice = " + originPrice + "- productId = " + productId + "- readyTime = " + readyTime
				+ "- remark = " + remark + "- isPrint = " + isPrint + "- currentPrice = " + currentPrice + "- couponId = " + couponId + "- staffId = " + staffId + "- orderId = "
				+ orderId + "- id = " + id + "- stateId = " + stateId + "- orderTime = " + orderTime + "- oid = " + oid + "- quantity = " + quantity + "- isSpecial = " + isSpecial
				+ "- discountPercentage = " + discountPercentage + "- sn = " + sn + "- shopId = " + shopId + "- createOn = " + createOn + "- voidQuantity = " + voidQuantity
				+ "- parentOrderDetailId = " + parentOrderDetailId + "- goodsId = " + goodsId + "- numberOfReminding = " + numberOfReminding + "- billId = " + billId
				+ "- salesStaffId = " + salesStaffId + "- isFree = " + isFree + "- authStaffId =" + authStaffId;
	}

	public void clear() {
		weight = null;
		originPrice = null;
		productId = null;
		readyTime = null;
		remark = null;
		isPrint = null;
		currentPrice = null;
		couponId = null;
		staffId = null;
		orderId = null;
		id = null;
		stateId = null;
		orderTime = null;
		oid = null;
		quantity = null;
		isSpecial = null;
		discountPercentage = null;
		sn = null;
		shopId = null;
		createOn = null;
		voidQuantity = null;
		parentOrderDetailId = null;
		goodsId = null;
		numberOfReminding = null;
		billId = null;
		salesStaffId = null;
		isFree = null;
		authStaffId = null;
	}

	@SerializedName("weight")
	public Double weight;

	@SerializedName("origin_price")
	public Double originPrice;

	@SerializedName("product_id")
	public Long productId;

	@SerializedName("ready_time")
	public java.util.Date readyTime;

	@SerializedName("remark")
	public String remark;

	@SerializedName("is_print")
	public Boolean isPrint;

	@SerializedName("current_price")
	public Double currentPrice;

	@SerializedName("coupon_id")
	public Long couponId;

	@SerializedName("staff_id")
	public Long staffId;

	@SerializedName("order_id")
	public Long orderId;

	@SerializedName("auth_staff_id")
	public Long authStaffId;

	@SerializedName("id")
	public Long id;

	@SerializedName("state_id")
	public Integer stateId;

	@SerializedName("order_time")
	public java.util.Date orderTime;

	@SerializedName("oid")
	public Integer oid;

	@SerializedName("quantity")
	public Integer quantity;

	@SerializedName("is_special")
	public Boolean isSpecial;

	@SerializedName("discount_percentage")
	public Integer discountPercentage;

	@SerializedName("sn")
	public String sn;

	@SerializedName("shop_id")
	public Long shopId;

	@SerializedName("create_on")
	public java.util.Date createOn;

	@SerializedName("void_quantity")
	public Integer voidQuantity;

	@SerializedName("parent_order_detail_id")
	public Long parentOrderDetailId;

	@SerializedName("goods_id")
	public Long goodsId;

	@SerializedName("number_of_reminding")
	public Integer numberOfReminding;

	@SerializedName("bill_id")
	public Long billId;

	@SerializedName("sales_staff_id")
	public Long salesStaffId;

	@SerializedName("is_free")
	public Boolean isFree;

	public static CashierOrderDetail fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, CashierOrderDetail.class);
	}

}
