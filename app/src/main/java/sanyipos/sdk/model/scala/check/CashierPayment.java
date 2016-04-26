package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class CashierPayment {

	@SerializedName("id")
	public long id;

	@SerializedName("paymentType")
	public Integer paymentType;

	@SerializedName("paymentName")
	public String paymentName;

	@SerializedName("value")
	public double value;

	@SerializedName("change")
	public double change;

	@SerializedName("transaction")
	public String transaction;
}
