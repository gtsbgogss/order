package sanyipos.sdk.model.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜品大类
 * 
 * @author admin
 * 
 */
public class GoodsGroup {

	public long id;
	public long order;
	public List<SubGroupsRest> subgroups;
	public String name;
	public long productType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOrder() {
		return order;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public List<SubGroupsRest> getSubgroups() {
		return subgroups;
	}

	public void setSubgroups(List<SubGroupsRest> subgroups) {
		this.subgroups = subgroups;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getProductType() {
		return productType;
	}

	public void setProductType(long productType) {
		this.productType = productType;
	}

	/**
	 * 获取所有的菜品
	 * 
	 * @return
	 */
	public List<ProductRest> getAllProducts() {
		List<ProductRest> products = new ArrayList<ProductRest>();
		for (SubGroupsRest subgroup : subgroups) {
			for (Units unit : subgroup.units) {
				products.addAll(unit.products);
			}
		}
		return products;
	}
}
