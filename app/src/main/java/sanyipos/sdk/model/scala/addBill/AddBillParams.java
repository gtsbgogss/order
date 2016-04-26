package sanyipos.sdk.model.scala.addBill;

import java.util.ArrayList;
import java.util.List;

public class AddBillParams {

	public List<AddBillOrder> orders = new ArrayList<AddBillOrder>();

	public List<AddBillOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<AddBillOrder> orders) {
		this.orders = orders;
	}

	public void addOrders(AddBillOrder order) {
		this.orders.add(order);
	}

	public void removeOrders(AddBillOrder order) {
		this.orders.remove(order);
	}

}
