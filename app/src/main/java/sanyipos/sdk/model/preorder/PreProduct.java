package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * 预点商品
 * 
 * @author ming.cheng
 * @date 2015年4月24日
 *
 */
public class PreProduct {
	
	@SerializedName("id")
	public Long id;
	
	@SerializedName("brand")
	public Long brandId;
	
	@SerializedName("goods")
	public Long goodsId;
	
	@SerializedName("plan")
	public Integer plan;
	
	@SerializedName("price")
	public Double price;
	
	@SerializedName("order")
	public Integer order;
	
	@SerializedName("beginTime")
	public Date beginTime;
	
	@SerializedName("endTime")
	public Date endTime;
	
	@SerializedName("monday")
	public Boolean monday;
	
	@SerializedName("tuesday")
	public Boolean tuesday;
	
	@SerializedName("wednesday")
	public Boolean wednesday;
	
	@SerializedName("thursday")
	public Boolean thursday;
	
	@SerializedName("friday")
	public Boolean friday;
	
	@SerializedName("saturday")
	public Boolean saturday;
	
	@SerializedName("sunday")
	public Boolean sunday;

	@SerializedName("state")
	public Integer state;
	
	@SerializedName("createon")
	public Date create_on;
}
