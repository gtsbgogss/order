package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class OrderEntity {

	@SerializedName("mincharge")
	public Double mincharge;

	@SerializedName("sn")
	public String sn;

	@SerializedName("table")
	public Long table;

	@SerializedName("surcharge")
	public Double surcharge;

	@SerializedName("discount")
	public Double discount;

	@SerializedName("amount")
	public Double amount;

	@SerializedName("personCount")
	public Integer personCount;

	@SerializedName("staffId")
	public Long staffId;

	@SerializedName("order")
	public Long order;

	@SerializedName("seat")
	public Long seat;

	@SerializedName("tableName")
	public String tableName;

	@SerializedName("staffName")
	public String staffName;

	@SerializedName("value")
	public Double value;

	@SerializedName("createon")
	public Date createTime;

	@SerializedName("tag")
	public String tag;
}
