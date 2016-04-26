package sanyipos.sdk.model.scala.changeBill;

public class ChangeBillParams {

	public long getBill() {
		return bill;
	}

	public void setBill(long bill) {
		this.bill = bill;
	}

	public ChangeBillAction getAction() {
		return action;
	}

	public void setAction(ChangeBillAction action) {
		this.action = action;
	}

	public long bill;

	public ChangeBillAction action;
}
