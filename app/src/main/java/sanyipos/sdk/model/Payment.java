package sanyipos.sdk.model;

public class Payment {
	
	public static final int PAYMENT_CASH 			= 1;		// 现金
	public static final int PAYMENT_BANK_CARD 		= 2;		// 银行卡
	public static final int PAYMENT_STORE_VALUE 	= 3;
	public static final int PAYMENT_ALIPAY 			= 4;		// 支付宝
	public static final int PAYMENT_WECHAT 			= 5;		// 微信
	public static final int PAYMENT_VOUCHER 		= 6;		// 代金券
	public static final int PAYMENT_DISCOUNT 		= 7;		// 折扣
	public static final int PAYMENT_WAIVE 			= 8;		// 免单
	public static final int PAYMENT_DEBIT 			= 9;
	public static final int PAYMENT_NOCENT 			= 10;		// 抹零
	public static final int PAYMENT_MINCHARGE 		= 11;		// 最低消费
	public static final int PAYMENT_PROMOTION 		= 12;		// 促销活动
	// public static final int PAYMENT_MEMEBER = 13;
	public static final int PAYMENT_SURCHARGE 		= 13;		// 服务费
	public static final int PAYMENT_CUSTOM 			= 14;		// 自定义收银方式
	
	int rowNo;
	public int paymentType;
	Long customPaymentType;
	Long voucherTypeId;

//	String paymentName;
	String paymentAmount;
	String paymentChange;
	String paymentReceipt = "";
	String paymentStaffId;
	Long paymentId = (long) -1;
	Long refId = (long) -1;
	Long promotionId = (long) -1;
	boolean isTemp = false;

	public Long getVoucherTypeId() {
		return voucherTypeId;
	}

	public void setVoucherTypeId(Long voucherTypeId) {
		this.voucherTypeId = voucherTypeId;
	}

	public Long getCustomPaymentType() {
		return customPaymentType;
	}

	public void setCustomPaymentType(Long customPaymentType) {
		this.customPaymentType = customPaymentType;
	}

	public Long getRefId() {
		return refId;
	}

	public void setRefId(Long refId) {
		this.refId = refId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPayMentStaffId() {
		return paymentStaffId;
	}
	public void setPayMentStaffId(String payMentStaffId) {
		this.paymentStaffId = payMentStaffId;
	}

	public int getRowNo() {
		return rowNo;
	}

	public void setRowNo(int rowNo) {
		this.rowNo = rowNo;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

//	public String getPaymentName() {
//		return paymentName;
//	}

//	public void setPaymentName(String paymentName) {
//		this.paymentName = paymentName;
//	}
	

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentChange() {
		return paymentChange;
	}

	public void setPaymentChange(String paymentChange) {
		this.paymentChange = paymentChange;
	}

	public String getPaymentReceipt() {
		return paymentReceipt;
	}

	public void setPaymentReceipt(String paymentReceipt) {
		if (paymentReceipt==null || ("null").equals(paymentReceipt)) {
			paymentReceipt = "";
		}
		this.paymentReceipt = paymentReceipt;
	}

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

}