package sanyipos.sdk.model.scala.changeDetail;


import sanyipos.sdk.model.scala.addDetail.model.AddDetaiAction;

public class ChangeDetailAction {
	public long orderDetail;
	public AddDetaiAction action;

	public ChangeDetailAction(long orderId, AddDetaiAction action) {
		this.orderDetail = orderId;
		this.action = action;
	}

	public long getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(long orderDetail) {
		this.orderDetail = orderDetail;
	}

	public AddDetaiAction getAction() {
		return action;
	}

	public void setAction(AddDetaiAction action) {
		this.action = action;
	}
}
