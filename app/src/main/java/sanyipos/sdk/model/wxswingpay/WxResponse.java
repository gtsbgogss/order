package sanyipos.sdk.model.wxswingpay;

import com.google.gson.annotations.SerializedName;

public class WxResponse {
	
	// 支付状态
	public static final String PAY_STATUS_SUCCESS = "SUCCESS";
	public static final String PAY_STATUS_FAIL = "FAIL";
	public static final String PAY_STATUS_ORDERPAID = "ORDERPAID";
	public static final String PAY_STATUS_USERPAYING = "USERPAYING";
	public static final String PAY_STATUS_SYSTEMERROR = "SYSTEMERROR";
	
	// 查询返回的交易状态
	public static final String TRADE_STATE_SUCCESS = "SUCCESS";
	public static final String TRADE_STATE_NOTPAY = "NOTPAY";
	public static final String TRADE_STATE_REFUND = "REFUND";
	public static final String TRADE_STATE_CLOSED = "CLOSED";
	public static final String TRADE_STATE_REVOKED = "REVOKED";
	public static final String TRADE_STATE_USERPAYING = "USERPAYING";
	public static final String TRADE_STATE_PAYERROR = "PAYERROR";
	
	// 撤销返回的状态
	public static final String REVERSE_SUCCESS = "REVERSE_SUCCESS";
	public static final String REVERSE_FAIL = "REVERSE_FAIL";
//	public static final String 
	
	@SerializedName("return_code")
	public String return_code;
	
	@SerializedName("return_message")
	public String return_message;
	
	@SerializedName("transaction_id")
	public String transaction_id;
	
	@SerializedName("out_trade_no")
	public String out_trade_no;

}
