package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CashierParamResult {

	@SerializedName("discountPlans")
	public List<DiscountPlan> discountPlans;

	@SerializedName("voucherTypes")
	public List<VoucherType> voucherTypes;

	@SerializedName("paymentModes")
	public List<PaymentMode> paymentModes;
	
	@SerializedName("promotions")
	public List<Promotion> promotions;

	@SerializedName("mincharge")
	public Double mincharge;

	public static class DiscountPlan {

		@SerializedName("id")
		public long id;

		@SerializedName("name")
		public String name;

		@SerializedName("remark")
		public String remark;

	}

	public static class VoucherType {

		@SerializedName("id")
		public long id;

		@SerializedName("name")
		public String name;

		@SerializedName("value")
		public Double value;

		@SerializedName("remark")
		public String remark;
	}

	public static class PaymentMode {

		@SerializedName("id")
		public long id;

		@SerializedName("name")
		public String name;

		@SerializedName("remark")
		public String remark;
	}
	
	public static class Promotion {
		
		@SerializedName("id")
		public long id;
		
		@SerializedName("name")
		public String name;
		
		@SerializedName("promotionType")
		public long promotionType;
		
		@SerializedName("promotionTypeName")
		public String promotionTypeName;
		
		@SerializedName("roles")
		public List<Role> roles;
		
		@SerializedName("memberTypes")
		public List<MemberType> memberTypes;
		
		@SerializedName("exclusive")
		public boolean exclusive;
		
		public class Role {
			@SerializedName("id")
			public long id;
			
			@SerializedName("name")
			public String name;
		}
		
		public class MemberType {
			@SerializedName("id")
			public long id;
			@SerializedName("name")
			public String name;
			@SerializedName("remark")
			public String remark;
		}

	}

}
