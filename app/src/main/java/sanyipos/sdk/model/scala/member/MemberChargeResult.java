package sanyipos.sdk.model.scala.member;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * 充值返回
 * 
 * @author ming.cheng
 * @date 2015/06/17
 * 
 */
public class MemberChargeResult {

	@SerializedName("msg")
	public String msg;

	@SerializedName("result")
	public ChargeResult result;

	public static class ChargeResult {

		@SerializedName("sn")
		public String sn;

		@SerializedName("member_id")
		public long member;

		@SerializedName("charge_value")
		public double charge_value;

		@SerializedName("balance")
		public double balance;

		@SerializedName("gift_value")
		public double gift_value;

		@SerializedName("gift_balance")
		public double gift_balance;
		
		@SerializedName("create_on")
		public Date create_on;

	}

}
