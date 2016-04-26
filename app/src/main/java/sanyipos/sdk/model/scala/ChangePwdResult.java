package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

public class ChangePwdResult {
	@SerializedName("staff")
	public Long staff;
	
	@SerializedName("password")
	public String password;
}
