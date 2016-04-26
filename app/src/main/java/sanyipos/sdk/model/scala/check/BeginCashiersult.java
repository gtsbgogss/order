package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class BeginCashiersult {
	@SerializedName("cashier")
	public CashierResult cashierResult;
	
	@SerializedName("param")
	public CashierParamResult param;
}
