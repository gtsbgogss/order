package sanyipos.sdk.model.scala.addDetail;


import java.util.ArrayList;
import java.util.List;

import sanyipos.sdk.model.scala.addDetail.model.Detail;

public class AddDetailParams {

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	public List<Long> getSeats() {
		return seats;
	}

	public void setSeats(List<Long> seats) {
		this.seats = seats;
	}

	public boolean isPrint() {
		return isPrint;
	}

	public void setPrint(boolean isPrint) {
		this.isPrint = isPrint;
	}

	public List<Detail> details = new ArrayList<Detail>();

	public List<Long> seats = new ArrayList<Long>();

	public boolean isPrint = false;
}
