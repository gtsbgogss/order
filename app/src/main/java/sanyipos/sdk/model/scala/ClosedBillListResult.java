package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClosedBillListResult {
	
	@SerializedName("bills")
	public List<ClosedBill> bills;
	
}
