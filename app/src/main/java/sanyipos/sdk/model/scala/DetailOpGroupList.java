package sanyipos.sdk.model.scala;

import java.util.List;

public class DetailOpGroupList {
	
	public List<DetailOpChildList> childList;
	
	public static class DetailOpChildList{
		
		public Long detail;
		
		public String name;
		
		public List<DetailOpResult.DetailLog> detailLogs;
 	}
}
