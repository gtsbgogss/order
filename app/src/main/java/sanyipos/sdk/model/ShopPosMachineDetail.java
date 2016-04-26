package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class ShopPosMachineDetail {

	public ShopPosMachineDetail() {
	}

	@SerializedName("access_code")
	public String accessCode;

	@SerializedName("printer_id")
	public Long usePrinterId;

	@SerializedName("id")
	public Long id;

	@SerializedName("printer_name")
	public String printerName;

	@SerializedName("printer_state")
	public Long printerState;

	@SerializedName("monitoring")
	public boolean monitoring;

	@SerializedName("salt")
	public String salt;

	public static ShopPosMachineDetail fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, ShopPosMachineDetail.class);
	}

}
