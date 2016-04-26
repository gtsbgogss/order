package sanyipos.sdk.model.preorder;

import com.google.gson.annotations.SerializedName;

public class PreCook {
	@SerializedName("goods")
	public PreGood preGoods;

	@SerializedName("product")
	public PreProduct preProduct;
	
	@SerializedName("isPrivate")
	public Boolean isPrivate;
}
