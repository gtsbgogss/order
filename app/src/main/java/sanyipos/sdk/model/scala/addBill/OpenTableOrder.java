package sanyipos.sdk.model.scala.addBill;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class OpenTableOrder {
	public OpenTableOrder() {
	}

	@SerializedName("id")
	public Long id;

	@SerializedName("shop_id")
	public Integer shopId;

	@SerializedName("sn")
	public Long sn;

	@SerializedName("bill_id")
	public Long billId;

	@SerializedName("table_seat_id")
	public Long tableSeatId;

	@SerializedName("person_count")
	public Integer personCount;

	@SerializedName("create_on")
	public Date createOn;

	@Override
	public String toString() {
		return "OpenTableOrder [id=" + id + ", shopId=" + shopId + ", sn=" + sn + ", billId=" + billId + ", tableSeatId=" + tableSeatId + ", personCount=" + personCount + ", createOn=" + createOn
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public static OpenTableOrder fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, OpenTableOrder.class);
	}
}
