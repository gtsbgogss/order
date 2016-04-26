package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class DetailOpResult {
	@SerializedName("logs")
	public List<DetailLog> logs;
	
	public static class DetailLog{
		@SerializedName("id")
		public Long id;
		
		@SerializedName("action")
		public String action;
		
		@SerializedName("message")
		public String message;
		
		@SerializedName("staffName")
		public String staffName;
		
		@SerializedName("authStaffName")
		public String authStaffName;
		
		@SerializedName("ip")
		public String ip;
		
		@SerializedName("posName")
		public String posName;
		
		@SerializedName("order")
		public Long order;
		
		@SerializedName("detail")
		public Long detail;
		
		@SerializedName("goodsName")
		public String detailName;
		
		@SerializedName("createon")
		public Date createon;
	}
}
/*
 * {
  "logs": [
    {
      "id": 1,
      "action": "AddDetail",
      "message": "点菜 XX 1 份",
      "staffName": "林的凤",
      "authStaffName": "林的凤",
      "ip": "192.168.1.103",
      "posName": "点单一",
      "createon": "2015-08-06 00:00:00"
    }
  ]
}

 * */
