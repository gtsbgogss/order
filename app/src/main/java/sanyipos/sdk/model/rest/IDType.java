package sanyipos.sdk.model.rest;

public class IDType {
	public long id;
	public long order;
	public String remark;
	public String name;

	public void setId(long id) {
		this.id = id;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public long getOrder() {
		return order;
	}

	public String getRemark() {
		return remark;
	}

	public String getName() {
		return name;
	}
}
