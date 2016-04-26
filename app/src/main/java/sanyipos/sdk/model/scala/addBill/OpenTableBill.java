package sanyipos.sdk.model.scala.addBill;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class OpenTableBill {

	public OpenTableBill() {
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", shopId=" + shopId + ", sn=" + sn + ", staffId=" + staffId + ", amount=" + amount + ", numOfPrePrint=" + numOfPrePrint + ", numOfRePrint=" + numOfRePrint
				+ ", stateId=" + stateId + ", createOn=" + createOn + "]";
	}

	@SerializedName("id")
	public Long id;

	@SerializedName("shop_id")
	public Integer shopId;

	@SerializedName("sn")
	public Long sn;

	@SerializedName("staff_id")
	public Long staffId;

	@SerializedName("amount")
	public Double amount;

	@SerializedName("num_of_preprint")
	public Integer numOfPrePrint;

	@SerializedName("num_of_reprint")
	public Integer numOfRePrint;

	@SerializedName("state_id")
	public Long stateId;

	@SerializedName("create_on")
	public Date createOn;

	public static OpenTableBill fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, OpenTableBill.class);
	}

}
