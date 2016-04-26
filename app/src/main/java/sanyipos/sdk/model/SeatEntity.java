package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

public class SeatEntity {

	@SerializedName("seat")
	public long seat;

	@SerializedName("tableName")
	public String tableName;

	@SerializedName("tableTypeName")
	public String tableTypeName;

	@SerializedName("tableType")
	public long tableType;

	@SerializedName("tableGroupName")
	public String tableGroupName;
	
	@SerializedName("tableOrder")
	public long tableOrder;

	@SerializedName("table")
	public long table;

	@SerializedName("tableGroup")
	public long tableGroup;

	@SerializedName("sysSeat")
	public long sysSeat;

	@SerializedName("order")
	public OrderEntity order;

	@SerializedName("state")
	public long state;

	@SerializedName("lock")
	public boolean lock;

	@SerializedName("personCount")
	public Integer personCount;

	@SerializedName("lockedDevice")
	public long lockedDevice;

	@SerializedName("lockedDeviceName")
	public String lockedDeviceName;

	@SerializedName("lockedStaff")
	public String lockedStaff;


	public boolean isChooseCombine;
}
