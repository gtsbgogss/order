package sanyipos.sdk.model.scala.check;

import java.util.ArrayList;
import java.util.List;

public class CashierParams {

	public List<Long> seats = new ArrayList<Long>();

	public CashierAction action;

	public List<Long> getSeats() {
		return seats;
	}

	public void setSeats(List<Long> seats) {
		this.seats = seats;
	}

	public CashierAction getAction() {
		return action;
	}

	public void setAction(CashierAction action) {
		this.action = action;
	}

}
