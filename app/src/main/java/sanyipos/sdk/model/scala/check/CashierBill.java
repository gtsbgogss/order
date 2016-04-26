package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class CashierBill {

	@SerializedName("id")
	public long id;

	@SerializedName("sn")
	public String sn;

	@SerializedName("staff")
	public long staffId;

	@SerializedName("staffName")
	public String staffName;

	@SerializedName("realValue")
	public double realValue;

	@SerializedName("paid")
	public double paid;

	@SerializedName("unpaid")
	public double unpaid;

	@SerializedName("amount")
	public double amount;

	@SerializedName("surcharge")
	public double surchagre;

	@SerializedName("mincharge")
	public double mincharge;

	@SerializedName("discount")
	public double discount;

	@SerializedName("isComplete")
	public boolean isComplete;

	@SerializedName("rounding")
	public double rounding;
	
	@SerializedName("promotion")
	public double promotion;

}
