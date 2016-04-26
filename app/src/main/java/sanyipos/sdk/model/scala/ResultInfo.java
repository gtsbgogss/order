package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

public class ResultInfo {

	@SerializedName("error_code")
	public Integer code;
	@SerializedName("message")
	public String message;
	@SerializedName("extra_message")
	public String extraMessage;

}
