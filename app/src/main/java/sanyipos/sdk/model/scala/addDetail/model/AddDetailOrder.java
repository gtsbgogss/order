package sanyipos.sdk.model.scala.addDetail.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class AddDetailOrder {

	@SerializedName("order")
	public Long orderId;

	@SerializedName("sn")
	public Long sn;

	@SerializedName("table")
	public Long tableId;

	@SerializedName("seat")
	public Long tableSeatId;

	@SerializedName("tableName")
	public String tableName;

	@SerializedName("personCount")
	public Integer personCount;

	@SerializedName("staff")
	public Long staffId;

	@SerializedName("staffName")
	public String staffName;

	@SerializedName("value")
	public Double value;

	@SerializedName("amount")
	public Double amount;

	@SerializedName("surcharge")
	public Double surcharge;

	@SerializedName("mincharge")
	public Double mincharge;

	@SerializedName("discount")
	public Double discount;

	@SerializedName("createon")
	public Date createOn;
	
	@SerializedName("tag")
	public String tag;

	@SerializedName("details")
	public List<AddDetailDetails> details;

}
