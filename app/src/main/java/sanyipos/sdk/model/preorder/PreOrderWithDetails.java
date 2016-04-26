package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

import sanyipos.sdk.model.ResultStatus;

public class PreOrderWithDetails {

	@SerializedName("content")
	public PreOrderContent preOrderContent;

	@SerializedName("status")
	public ResultStatus status;
}
