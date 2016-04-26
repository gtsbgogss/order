package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

public class MergedCashierOrderDetail extends CashierOrderDetail {

	@SerializedName("name")
	public String name;

	@SerializedName("sub_group_id")
	public Long subGroupId;

	@SerializedName("is_ingredient")
	public Boolean isIngredient = Boolean.FALSE;

	@SerializedName("is_weight")
	public Boolean isWeight = Boolean.FALSE;

	@SerializedName("table_seat_id")
	public Long tableSeatId;

	@SerializedName("is_set")
	public Boolean isSet = Boolean.FALSE;

	@SerializedName("is_cooking")
	public Boolean isCooking = Boolean.FALSE;

	@SerializedName("unit_name")
	public String unitName = "";

	public void copy(MergedCashierOrderDetail bean) {
		if (bean != null) {
			bean.name = name;
			bean.subGroupId = subGroupId;
			bean.isIngredient = isIngredient;
			bean.tableSeatId = tableSeatId;
			bean.goodsId = goodsId;
			bean.unitName = unitName;
			bean.isCooking = isCooking;
			super.copy(bean);
		}
	}
}