package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

public class CashierDiscount {

	@SerializedName("id")
	public long id;

	@SerializedName("value")
	public Double value;

	@SerializedName("discount")
	public long discountPlanId;
	
	@SerializedName("discountName")
	public String discountName;
}
