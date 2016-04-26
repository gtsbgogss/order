package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

public class RegisterResult {
	@SerializedName("id")
	public Long id;

	@SerializedName("shop_id")
	public Long shop_id;

	@SerializedName("name")
	public String name;

	@SerializedName("is_master")
	public Boolean is_master;

	@SerializedName("version")
	public String version;

	@SerializedName("access_code")
	public String access_code;

	@SerializedName("salt")
	public String salt;

	@SerializedName("ip")
	public String ip;

	@SerializedName("uuid")
	public String uuid;

	@SerializedName("state")
	public Integer state;

	@SerializedName("create_on")
	public String create_on;
}
