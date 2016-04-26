package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PreOrderContent {
	
	@SerializedName("sn")
	public int sn;
	
	@SerializedName("goodses")
	public List<PreOrderDetail> preOrderDetails;
}
