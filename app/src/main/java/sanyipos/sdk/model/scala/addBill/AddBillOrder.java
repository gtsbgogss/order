package sanyipos.sdk.model.scala.addBill;

public class AddBillOrder {
	public long seat;
	public int personCount;

	public long getSeatID() {
		return seat;
	}

	public void setSeatID(long seatID) {
		this.seat = seatID;
	}

	public int getPersonCount() {
		return personCount;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

}
