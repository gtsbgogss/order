package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

public class SoldoutResult {

	@SerializedName("goods")
	public long goodsId;

	@SerializedName("product")
	public long productId;

	@SerializedName("goodsName")
	public String goodsName;

	@SerializedName("group")
	public long goodsGroup;

	@SerializedName("groupName")
	public String groupName;

	@SerializedName("subgroup")
	public long subGroup;

	@SerializedName("subgroupName")
	public String subGroupName;

	@SerializedName("count")
	public Double count;

	@SerializedName("longterm")
	public boolean longterm;

	@SerializedName("unitType")
	public long unitType;

	@SerializedName("unitTypeName")
	public String unitTypeName;
}
