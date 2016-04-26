package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class DaySettleResult {
	@SerializedName("businessDays")
	public List<Date> businessDays;

	@SerializedName("businessDay")
	public Date businessDay;

	@SerializedName("beginDate")
	public Date beginDate;

	@SerializedName("endDate")
	public Date endDate;
}