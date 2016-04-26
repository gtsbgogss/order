package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import sanyipos.sdk.gson.GsonFactory;
import sanyipos.sdk.model.scala.SoldoutResult;
import sanyipos.sdk.model.scala.check.CashierBill;

public class OperationData {

	public static final String UPDATED_DATA = "data_updated";

	@SerializedName("version")
	public Long version;

	@SerializedName("customer_count")
	public Integer customerCount;

	@SerializedName("shop")
	public Shop shop;

	@SerializedName("shop_table")
	public List<SeatEntity> shopTables = new ArrayList<SeatEntity>();

	@SerializedName("shop_printer")
	public List<ShopPrinter> shopPrinters = new ArrayList<ShopPrinter>();

	@SerializedName("shop_pos_machine")
	public List<ShopPosMachineDetail> shopPosMachine = new ArrayList<ShopPosMachineDetail>();

	@SerializedName("soldouts")
	public List<SoldoutResult> soldouts = new ArrayList<SoldoutResult>();

	@SerializedName("notifications")
	public List<Notification> notifications = new ArrayList<Notification>();

	public static OperationData fromJson(String json) {
		Gson gson = GsonFactory.getGson();

		return gson.fromJson(json, OperationData.class);
	}

	public static OperationData fromJson(Reader json) {
		Gson gson = GsonFactory.getGson();

		return gson.fromJson(json, OperationData.class);
	}

	public static class OperationCashierBill extends CashierBill {

		@SerializedName("num_of_seat")
		public Integer numOfSeat;

		@SerializedName("total")
		public Double total;

		@SerializedName("merge_id")
		public Integer mergeId;
	}

	public static class Notification {
		@SerializedName("notification_type")
		public Integer notificationType = 0;

		@SerializedName("extra_info")
		public String extraInfo;
	}

	public SeatEntity getSeat(long seat) {
		for (SeatEntity s : shopTables) {
			if (s.seat == seat) {
				return s;
			}
		}
		return null;
	}
	/**
	 * 并台账单获取并台标志
	 * @param seat
	 * @return
	 */
	public String getCombineTag(long seat){
		for (SeatEntity s : shopTables) {
			if (s.seat == seat) {
				return s.order.tag;
			}
		}
		return null;
	}
	
	public ShopPrinter getShopPrinter(long printerId) {
		for (ShopPrinter printer : shopPrinters) {
			if (printer.id == printerId) {
				return printer;
			}
		}
		return null;
	}
	
	public List<SeatEntity> getTablesByTableGroupId(long tableGroupId){
		List<SeatEntity> tables = new ArrayList<SeatEntity>();
		for (int i = 0; i < shopTables.size(); i++) {
			SeatEntity table = shopTables.get(i);
			if (table.tableGroup == tableGroupId) {
				tables.add(table);
			}
		}
		return tables;
	}

}
