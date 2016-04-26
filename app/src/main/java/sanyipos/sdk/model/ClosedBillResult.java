package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import sanyipos.sdk.model.scala.ClosedBill;

public class ClosedBillResult {

	@SerializedName("closed-bill-list")
	public List<ClosedBill> closedBillList;

	@SerializedName("business-day-list")
	public List<Date> businessDayList;

	@SerializedName("status")
	public ResultStatus status;
}