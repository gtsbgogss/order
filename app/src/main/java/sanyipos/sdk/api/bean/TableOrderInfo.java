package sanyipos.sdk.api.bean;

import java.io.Serializable;

/**
 * 桌子订单信息
 * 
 * @author ming.cheng
 * @date 2015/05/22
 * 
 */
public class TableOrderInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long orderId; // 订单id
	private long tableId; // 桌号
	private long tableSeatId; // 座位号
	private String tableName; // 桌名
	private int personCount; // 人数
	private long openStaffId; // 开台员工id
	private String openStaffName; // 开台员工名
	private double amount; // 已落单菜品价格
	private double value;  //桌子账单价格
	private String tag;

	@Override
	public String toString() {
		return "TableOrderInfo{" +
				"orderId=" + orderId +
				", tableId=" + tableId +
				", tableSeatId=" + tableSeatId +
				", tableName='" + tableName + '\'' +
				", personCount=" + personCount +
				", openStaffId=" + openStaffId +
				", openStaffName='" + openStaffName + '\'' +
				", amount=" + amount +
				", value=" + value +
				", tag='" + tag + '\'' +
				'}';
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getTableId() {
		return tableId;
	}

	public void setTableId(long tableId) {
		this.tableId = tableId;
	}

	public long getTableSeatId() {
		return tableSeatId;
	}

	public void setTableSeatId(long tableSeatId) {
		this.tableSeatId = tableSeatId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getPersonCount() {
		return personCount;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	public long getOpenStaffId() {
		return openStaffId;
	}

	public void setOpenStaffId(long openStaffId) {
		this.openStaffId = openStaffId;
	}

	public String getOpenStaffName() {
		return openStaffName;
	}

	public void setOpenStaffName(String openStaffName) {
		this.openStaffName = openStaffName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
