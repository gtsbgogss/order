package sanyipos.sdk.model.scala.addDetail.model;

public class AddDetaiAction {

	public final static int ACTION_ADD = 1; // 下单
	public final static int ACTION_GIFT = 2; // 赠送
	public final static int ACTION_CHANGEPRICE = 3; // 改价
	public final static int ACTION_TURN = 4;// 转菜
	public final static int ACTION_REMIND = 5;// 催菜
	public final static int ACTION_UNDOGIFT = 6;// 取消赠送
	public final static int ACTION_HOLD = 7;// 挂起
	public final static int ACTION_COOK = 8;// 叫起
	public final static int ACTION_RETURN = 9;// 退菜
	public final static int ACTION_CHANGEWEIGHT = 10; // 改重
	public final static int ACTION_RETURNALL = 11; // 整桌退
	public final static int ACTION_REMINDALL = 12; // 整桌催
	public final static int ACTION_REPRINTORDER = 13; // 重打点菜单
	public final static int ACTION_CANCELPREPRINT = 14;// 取消预打印

	public static String getActionById(int actionId) {
		switch (actionId) {
		case ACTION_ADD:
			return "AddDetail";
		case ACTION_GIFT:
			return "GiftDetail";
		case ACTION_CHANGEPRICE:
			return "ChangePriceDetail";
		case ACTION_TURN:
			return "TurnDetail";
		case ACTION_REMIND:
			return "RemindDetail";
		case ACTION_UNDOGIFT:
			return "UndoGiftDetail";
		case ACTION_HOLD:
			return "HoldDetail";
		case ACTION_COOK:
			return "CookDetail";
		case ACTION_RETURN:
			return "ReturnDetail";
		case ACTION_CHANGEWEIGHT:
			return "ChangeWeightDetail";
		case ACTION_RETURNALL:
			return "ReturnAllDetail";
		case ACTION_REMINDALL:
			return "RemindAllDetail";
		case ACTION_REPRINTORDER:
			return "ReprintOrder";
		case ACTION_CANCELPREPRINT:
			return "CancelPreprint";
		default:
			return null;
		}
	}

	public String action;
	public long authStaff;
	public int count;
	public double weight;
	public double price;
	public long seat;
	public long reason;
	public String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public AddDetaiAction() {

	}

	public AddDetaiAction(int action, long authStaffId) {
		this.action = getActionById(action);
		this.authStaff = authStaffId;
	}

	public AddDetaiAction(int action, long authStaffId, Double param) {
		this.action = getActionById(action);
		this.authStaff = authStaffId;
		if (action == ACTION_CHANGEPRICE) {
			this.price = param;
		} else if (action == ACTION_CHANGEWEIGHT) {
			this.weight = param;
		}
	}

	public AddDetaiAction(int action, long authStaffId, int count, long resonId, String remark) {
		this.action = getActionById(action);
		this.authStaff = authStaffId;
		this.count = count;
		this.reason = resonId;
		this.remark = remark;
	}

	public AddDetaiAction(int action, long authStaffId, long reasonId, String remark) {
		this.action = getActionById(action);
		this.authStaff = authStaffId;
		this.reason = reasonId;
		this.remark = remark;
	}

	public AddDetaiAction(int action, long authStaffId, long seatId) {
		this.action = getActionById(action);
		this.authStaff = authStaffId;
		this.seat = seatId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
