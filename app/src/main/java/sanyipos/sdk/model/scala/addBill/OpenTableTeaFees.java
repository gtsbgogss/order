package sanyipos.sdk.model.scala.addBill;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class OpenTableTeaFees {

	public OpenTableTeaFees() {

	}

	@SerializedName("product")
	public OpenTableProduct teaFees;

	@SerializedName("count")
	public Integer count;

	public static OpenTableTeaFees fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.fromJson(json, OpenTableTeaFees.class);
	}

	public class OpenTableProduct {

		@SerializedName("product")
		public Long productId;

		@SerializedName("goods")
		public Long goodsId;

		@SerializedName("goodsName")
		public String goodsName;

		@SerializedName("price")
		public Double price;

		@SerializedName("productType")
		public Long productType;

		@SerializedName("productTypeName")
		public String productTypeName;

	}
}
