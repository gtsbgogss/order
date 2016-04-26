package sanyipos.sdk.model.scala.check;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 会员信息返回
 * @author admin
 *
 */
public class MembersResult {

	@SerializedName("members")
	public List<MemberInfo> members;
	
}
