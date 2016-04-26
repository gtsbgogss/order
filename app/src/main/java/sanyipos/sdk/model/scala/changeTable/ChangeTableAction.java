package sanyipos.sdk.model.scala.changeTable;

public class ChangeTableAction {

	public final static int SPLITTABLE = 1; // 搭台
	public final static int UNDOSPLITTABLE = 2;// 取消搭台
	public final static int TURNTABLE = 3; // 转台
	public final static int CANCELTABLE = 4;// 消台
	public final static int CHANGEPERSON = 5; // 修改人数
	public String action;
	public long authStaff;
	public long seat;
	public int count;

	public String getActionById(int action) {
		switch (action) {
		case SPLITTABLE:
			return "SplitTable";
		case UNDOSPLITTABLE:
			return "UndoSplitTable";
		case TURNTABLE:
			return "TurnTable";
		case CANCELTABLE:
			return "CancelTable";
		case CHANGEPERSON:
			return "ChangePersonCount";
		}
		return null;
	}

	public ChangeTableAction(int action, long authStaff) {
		this.action = getActionById(action);
		this.authStaff = authStaff;
	}

	public ChangeTableAction(int action, long seat, long authStaff) {
		this.action = getActionById(action);
		this.seat = seat;
		this.authStaff = authStaff;
	}

	public ChangeTableAction(long authStaff, int count) {
		this.action = getActionById(CHANGEPERSON);
		this.authStaff = authStaff;
		this.count = count;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public long getAuthStaff() {
		return authStaff;
	}

	public void setAuthStaff(long authStaff) {
		this.authStaff = authStaff;
	}

	public long getSeat() {
		return seat;
	}

	public void setSeat(long seat) {
		this.seat = seat;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
