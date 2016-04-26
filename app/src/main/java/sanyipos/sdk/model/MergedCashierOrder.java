package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

public class MergedCashierOrder extends CashierOrder {

	@SerializedName("table_name")
	public String tableaName;

	public double orderTotal = 0;
}