package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * 预点菜品
 * 
 * @author ming.cheng
 * @date 2015年4月24日
 *
 */
public class PreGood {
	
	@SerializedName("id")
	public Long id;
	
	@SerializedName("brand")
	public Long brandId;
	
	@SerializedName("name")
	public String name;
	
	@SerializedName("sn")
	public String sn;
	
	@SerializedName("group")
	public Long group;
	
	@SerializedName("subgroup")
	public Long subgroup;
	
	@SerializedName("productType")
	public Integer productType;
	
	@SerializedName("unitType")
	public Integer unitType;
	
	@SerializedName("spicyLevel")
	public Integer spicyLevel;
	
	@SerializedName("chefRecommended")
	public Boolean chefRecommended;
	
	@SerializedName("order")
	public Integer order;
	
	@SerializedName("state")
	public Integer state;
	
	@SerializedName("createon")
	public Date create_on;
}
