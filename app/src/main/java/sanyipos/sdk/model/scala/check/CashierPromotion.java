package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class CashierPromotion {
	
	@SerializedName("id")
	public long id;
	
	@SerializedName("promotion")
	public long promotion;
	
	@SerializedName("promotionName")
	public String promotionName;
	
	@SerializedName("promotionType")
	public long promotionType;
	
	@SerializedName("promotionTypeName")
	public String promotionTypeName;
	
	@SerializedName("value")
	public double value;
	
	@SerializedName("member")
	public long member;
	
	@SerializedName("memberType")
	public long memberType;

}
