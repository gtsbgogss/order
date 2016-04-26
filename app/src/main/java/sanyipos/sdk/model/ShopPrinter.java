package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

public class ShopPrinter {

	public ShopPrinter() {
	}

	public void copy(ShopPrinter bean) {
		if (bean != null) {
			bean.id = id;
			bean.stateId = stateId;
			bean.printerType = printerType;
			bean.shop = shop;
			bean.remark = remark;
			bean.createOn = createOn;
			bean.name = name;
			bean.ipPort = ipPort;
			bean.ip = ip;
			bean.jobs = jobs;
		}
	}

	public String toString() {
		return "\n[shop_printer]\n " + "- id = " + id + "- stateId = " + stateId + "- printerType = " + printerType + "- shop = " + shop + "- remark = " + remark + "- createOn = " + createOn
				+ "- name = " + name + "- ipPort = " + ipPort + "- ip = " + ip;
	}

	public void clear() {
		id = null;
		stateId = null;
		printerType = null;
		shop = null;
		remark = null;
		createOn = null;
		name = null;
		ipPort = null;
		ip = null;
		jobs = null;
	}

	@SerializedName("id")
	public Long id;

	@SerializedName("state")
	public Integer stateId;

	@SerializedName("printerType")
	public Integer printerType;

	@SerializedName("printerWidth")
	public Long printerWi;

	@SerializedName("shop")
	public Long shop;

	@SerializedName("remark")
	public String remark;

	@SerializedName("createon")
	public java.util.Date createOn;

	@SerializedName("name")
	public String name;

	@SerializedName("ipPort")
	public Integer ipPort;

	@SerializedName("ip")
	public String ip;

	@SerializedName("num_of_jobs")
	public String jobs;

	public static class CreatePinterResult {
		@SerializedName("printer")
		public ShopPrinter printer;
		@SerializedName("status")
		public ResultStatus status;
	}
}
