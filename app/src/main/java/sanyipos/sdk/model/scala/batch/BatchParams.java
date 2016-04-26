package sanyipos.sdk.model.scala.batch;

import java.util.ArrayList;
import java.util.List;

public class BatchParams {

	public List<Long> seats = new ArrayList<Long>();

	public List<Long> getSeats() {
		return seats;
	}

	public void setSeats(List<Long> seats) {
		this.seats = seats;
	}
}
