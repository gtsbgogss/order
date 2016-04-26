package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import sanyipos.sdk.model.scala.addDetail.model.AddDetailOrder;

public class CashierResult {

	@SerializedName("bill")
	public CashierBill bill;
	
	@SerializedName("member")
	public MemberInfo member;

	@SerializedName("orders")
	public List<AddDetailOrder> orders;

	@SerializedName("payments")
	public List<CashierPayment> payments;

	@SerializedName("discounts")
	public List<CashierDiscount> discounts;

	@SerializedName("surcharges")
	public List<CashierCharges> surcharges;

	@SerializedName("mincharges")
	public List<CashierCharges> mincharges;
	
	@SerializedName("promotions")
	public List<CashierPromotion> promotions;
}
