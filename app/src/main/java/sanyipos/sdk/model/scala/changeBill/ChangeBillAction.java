package sanyipos.sdk.model.scala.changeBill;

public class ChangeBillAction {

	public final static int UNDOBILL = 1; // 逆结
	public final static int REPRINT = 2;
	public String action;
	public long authStaff;

	public String getActionById(int action) {
		switch (action) {
		case UNDOBILL:
			return "UndoBill";
		case REPRINT:
			return "Reprint";
		}

		return null;
	}

	public ChangeBillAction(int action, long authStaff) {
		this.action = getActionById(action);
		this.authStaff = authStaff;
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

}
