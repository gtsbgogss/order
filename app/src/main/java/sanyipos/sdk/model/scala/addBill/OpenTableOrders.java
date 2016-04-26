package sanyipos.sdk.model.scala.addBill;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import sanyipos.sdk.model.scala.addDetail.model.AddDetailOrder;

public class OpenTableOrders {
	@SerializedName("order")
	public AddDetailOrder order;

	@SerializedName("teafees")
	public List<OpenTableTeaFees> teaFees;
}
