package sanyipos.sdk.model.scala.openTable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import sanyipos.sdk.model.scala.addDetail.model.AddDetailOrder;

public class OpenTableResult {

	@SerializedName("orders")
	public List<AddDetailOrder> orders;
}
