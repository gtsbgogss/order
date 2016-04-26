package sanyipos.sdk.model.scala.addDetail.model;

import java.util.ArrayList;
import java.util.List;

public class Detail {
	public long goods;
	public long product;
	public long tag;
	public List<AddDetaiAction> actions = new ArrayList<AddDetaiAction>();
	public List<Detail> children = new ArrayList<Detail>();

	public long getGoods() {
		return goods;
	}

	public void setGoodsId(long goodsId) {
		this.goods = goodsId;
	}

	public long getProductId() {
		return product;
	}

	public void setProductId(long productId) {
		this.product = productId;
	}

	public long getTag() {
		return tag;
	}

	public void setTag(long tag) {
		this.tag = tag;
	}

	public List<AddDetaiAction> getActions() {
		return actions;
	}

	public void setActions(List<AddDetaiAction> actions) {
		this.actions = actions;
	}

	public List<Detail> getChildren() {
		return children;
	}

	public void setChildren(List<Detail> children) {
		this.children = children;
	}

}
