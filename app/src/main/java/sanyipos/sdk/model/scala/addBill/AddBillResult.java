package sanyipos.sdk.model.scala.addBill;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddBillResult {

	@SerializedName("orders")
	public List<OpenTableOrders> orders;
}
