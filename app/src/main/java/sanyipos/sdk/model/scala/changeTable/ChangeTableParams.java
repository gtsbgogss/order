package sanyipos.sdk.model.scala.changeTable;

public class ChangeTableParams<T> {

	public long seat;

	public T action;

	public long getSeat() {
		return seat;
	}

	public void setSeat(long seat) {
		this.seat = seat;
	}

	public T getAction() {
		return action;
	}

	public void setAction(T action) {
		this.action = action;
	}
}
