package sanyipos.sdk.model.scala.member;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemberParamResult {
	
	@SerializedName("identTypes")
	public List<Type> idTypes;
	
	@SerializedName("memberTypes")
	public List<Type> memberTypes;
	
	public static class Type {
		
		@SerializedName("id")
		public long id;
		
		@SerializedName("name")
		public String name;
		
	}

}