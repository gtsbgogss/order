package sanyipos.sdk.model.scala;

import java.util.ArrayList;
import java.util.List;

public class UnLockTableParams {

	public List<Long> seats = new ArrayList<Long>();

	public Boolean force;

	public List<Long> getSeats() {
		return seats;
	}

	public void setSeats(List<Long> seats) {
		this.seats = seats;
	}

	public Boolean getForce() {
		return force;
	}

	public void setForce(Boolean force) {
		this.force = force;
	}
	
	

}
