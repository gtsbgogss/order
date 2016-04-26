package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class Shop {

	public Shop() {
	}

	public void copy(Shop bean) {
		if (bean != null) {
			bean.remark = remark;
			bean.zoneId = zoneId;
			bean.createOn = createOn;
			bean.brandId = brandId;
			bean.contactPerson = contactPerson;
			bean.id = id;
			bean.openingTime = openingTime;
			bean.address = address;
			bean.contactMobile = contactMobile;
			bean.name = name;
			bean.telephone = telephone;
			bean.closed = closed;
			bean.cloud_connection = cloud_connection;
			bean.salt = salt;
		}
	}

	public String toString() {
		return "\n[shop]\n " + "- remark = " + remark + "- zoneId = " + zoneId + "- createOn = " + createOn + "- brandId = " + brandId + "- contactPerson = " + contactPerson + "- id = " + id
				+ "- openingTime = " + openingTime + "- address = " + address + "- contactMobile = " + contactMobile + "- name = " + name + "- telephone = " + telephone + "- cloud_connection ="
				+ cloud_connection;
	}

	public void clear() {
		remark = null;
		zoneId = null;
		createOn = null;
		brandId = null;
		contactPerson = null;
		id = null;
		openingTime = null;
		address = null;
		contactMobile = null;
		name = null;
		telephone = null;
		closed = null;
		cloud_connection = null;
	}

	@SerializedName("remark")
	public String remark;

	@SerializedName("zone")
	public Long zoneId;

	@SerializedName("city")
	public Long cityId;

	@SerializedName("createon")
	public java.util.Date createOn;

	@SerializedName("brand")
	public Long brandId;

	@SerializedName("contactPerson")
	public String contactPerson;

	@SerializedName("id")
	public Long id;

	@SerializedName("opening")
	public java.util.Date openingTime;

	@SerializedName("address")
	public String address;

	@SerializedName("contactMobile")
	public String contactMobile;

	@SerializedName("name")
	public String name;

	@SerializedName("telephone")
	public String telephone;

	@SerializedName("closed")
	public Long closed;

	@SerializedName("cloud_connection")
	public Long cloud_connection;

	@SerializedName("salt")
	public String salt;

	public static Shop fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, Shop.class);
	}

}
