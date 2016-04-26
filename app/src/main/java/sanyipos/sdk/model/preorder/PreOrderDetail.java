package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 预订单结构
 * 
 * @author ming.cheng
 * @date 2015年4月24日
 * 
 */
public class PreOrderDetail {

//	@SerializedName("price")
//	public Double price;

	@SerializedName("goods")
	public PreGood preGoods;

	@SerializedName("product")
	public PreProduct preProduct;

	@SerializedName("quantity")
	public Integer quantity;

	@SerializedName("children")
	public List<PreOrderDetail> children;
}
