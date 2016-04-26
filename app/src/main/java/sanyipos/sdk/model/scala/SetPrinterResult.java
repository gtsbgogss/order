package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

public class SetPrinterResult { 
	@SerializedName("id")
	public Long id;
	
	@SerializedName("shop_id")
	public Long shop_id;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("access_code")
	public String access_code;
	
	@SerializedName("use_printer_id")
	public Long use_printer_id;
	
	@SerializedName("state")
	public Integer state;
	
	@SerializedName("create_on")
	public String create_on;
}
