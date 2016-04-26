package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

public class ResultStatus {

	@SerializedName("code")
	public Integer code;
	@SerializedName("message")
	public String message;
	
	public class ResultStatus_{
		@SerializedName("status")
		public ResultStatus status;
	}
}
