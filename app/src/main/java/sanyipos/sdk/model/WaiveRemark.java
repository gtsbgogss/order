package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class WaiveRemark {

	public WaiveRemark() {
	}

	public void copy(WaiveRemark bean) {
		if (bean != null) {
			bean.id = id;
			bean.order = order;
			bean.remark = remark;
			bean.name = name;
		}
	}

	public String toString() {
		return name;
	}

	public void clear() {
		id = null;
		order = null;
		remark = null;
		name = null;
	}

	@SerializedName("id")
	public Long id;

	@SerializedName("order")
	public Long order;

	@SerializedName("remark")
	public Integer remark;

	@SerializedName("name")
	public String name;

	public static WaiveRemark fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, WaiveRemark.class);
	}

}
