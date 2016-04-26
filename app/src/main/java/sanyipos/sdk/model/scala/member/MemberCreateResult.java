package sanyipos.sdk.model.scala.member;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * 创建会员的返回值
 * @author ming.cheng
 * @date 2015/06/18
 *
 */
public class MemberCreateResult {
	
	@SerializedName("member")
	public Member member;
	
	@SerializedName("card")
	public MemberCard card;
	
	public static class Member {
		
		@SerializedName("id")
		public long id;
		
		@SerializedName("brand_id")
		public long brand_id;
		
		@SerializedName("member_type_id")
		public long member_type_id;
		
		@SerializedName("sn")
		public String sn;
		
		@SerializedName("name")
		public String name;
		
		@SerializedName("password")
		public String password;
		
		@SerializedName("salt")
		public String salt;
		
		@SerializedName("sex")
		public String sex;
		
		@SerializedName("nickname")
		public String nickname;
		
		@SerializedName("first_name")
		public String first_name;
		
		@SerializedName("last_name")
		public String last_name;
		
		@SerializedName("id_type")
		public String id_type;
		
		@SerializedName("id_no")
		public String id_no;
		
		@SerializedName("point")
		public long point;
		
		@SerializedName("spending")
		public double spending;
		
		@SerializedName("charge_balance")
		public double charge_balance;
		
		@SerializedName("gift_balance")
		public double gift_balance;
		
		@SerializedName("debit_amount")
		public double debit_amount;
		
		@SerializedName("deposit")
		public double deposit;
		
		@SerializedName("birthday")
		public Date birthday;
		
		@SerializedName("address")
		public String address;
		
		@SerializedName("mobile")
		public String mobile;
		
		@SerializedName("email")
		public String email;
		
		@SerializedName("creator")
		public long creatorStaffId;
		
		@SerializedName("end_time")
		public Date end_time;
		
		@SerializedName("state")
		public long state;
		
		@SerializedName("create_on")
		public Date create_on;
	}
	
	public static class MemberCard {
		
		@SerializedName("id")
		public long id;
		
		@SerializedName("brand_id")
		public long brand_id;
		
		@SerializedName("member_id")
		public long member_id;
		
		@SerializedName("card_no")
		public String card_no;
		
		@SerializedName("rfid")
		public String rfid;
		
		@SerializedName("state")
		public long state;
		
		@SerializedName("create_on")
		public Date create_on;
		
	}

}
