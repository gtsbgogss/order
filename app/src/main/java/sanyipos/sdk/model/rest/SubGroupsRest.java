package sanyipos.sdk.model.rest;

import java.util.List;

public class SubGroupsRest {

	public long id;
	public long order;
	public String name;
	public long group;
	public List<Units> units;
	public long productType;

	public void setId(long id) {
		this.id = id;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGroup(long group) {
		this.group = group;
	}

	public void setProducts(List<Units> units) {
		this.units = units;
	}

	public void setProductType(long productType) {
		this.productType = productType;
	}

	public long getId() {
		return id;
	}

	public long getOrder() {
		return order;
	}

	public String getName() {
		return name;
	}

	public long getGroup() {
		return group;
	}

	public List<Units> getUnits() {
		return units;
	}

	public long getProductType() {
		return productType;
	}

}
