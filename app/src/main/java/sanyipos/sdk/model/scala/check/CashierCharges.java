package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class CashierCharges {
	@SerializedName("id")
	public long id;
	@SerializedName("shop_id")
	public long shopId;
	@SerializedName("bill_id")
	public long billId;
	@SerializedName("value")
	public double value;
}
