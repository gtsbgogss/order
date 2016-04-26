package sanyipos.sdk.model.scala.addDetail.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddDetailDetails {

	@SerializedName("order")
	public Long orderId;

	@SerializedName("orderDetail")
	public Long orderDetailId;

	@SerializedName("sn")
	public Long sn;

	@SerializedName("goods")
	public Long goodsId;

	@SerializedName("goodsName")
	public String goodsName;

	@SerializedName("product")
	public Long productId;

	@SerializedName("productType")
	public Long productType;

	@SerializedName("productTypeName")
	public String productName;

	@SerializedName("currentPrice")
	public Double currentPrice;
	
	@SerializedName("realCurrentPrice")
	public Double realCurrentPrice;
	
	@SerializedName("originPrice")
	public Double originPrice;

	@SerializedName("realValue")
	public Double realValue;

	@SerializedName("subValue")
	public Double subValue;

	@SerializedName("count")
	public Integer count;

	@SerializedName("returnCount")
	public Integer returnCount;

	@SerializedName("weight")
	public Double weight;

	@SerializedName("tag")
	public Long tag;

	@SerializedName("unitType")
	public Long unitType;

	@SerializedName("unitTypeName")
	public String unitTypeName;

	@SerializedName("children")
	public List<AddDetailDetails> children;

	@SerializedName("status")
	public Status status;
	
	@SerializedName("remark")
	public String remark;

	public class Status {

		@SerializedName("isGift")
		public boolean isGift;

		@SerializedName("isChange")
		public boolean isPriceChanged;

		@SerializedName("isSpecial")
		public boolean isSpecial;

		@SerializedName("isReturn")
		public boolean isReturn;

		@SerializedName("isDiscount")
		public boolean isDiscount;

		@SerializedName("isHold")
		public boolean isHold;

		@SerializedName("isMarket")
		public boolean isMarket;

		@SerializedName("isSet")
		public boolean isSet;

		@SerializedName("isSetItem")
		public boolean isSetItem;

		@SerializedName("isWeight")
		public boolean isWeight;

		@SerializedName("isIngredient")
		public boolean isIngredient;

		@SerializedName("isCooking")
		public boolean isCooking;

		@SerializedName("isVip")
		public boolean isVip;

		@SerializedName("isVoucher")
		public boolean isVoucher;
	}
}
