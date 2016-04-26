package sanyipos.sdk.model.rest;


import java.util.ArrayList;
import java.util.List;

import sanyipos.sdk.able.ISearchAble;

public class ProductRest extends ISearchAble {
	public long id;
	public double price;
	public long order;
	public String unitName;
	public String name;
	public long goods;
	public double originPrice;
	public long group;
	public long subgroup;
	public ProductType productType;
	public boolean soldout;
	
	public List<Long> subProducts;
	
	// 是否是多规格类型的菜品
	public boolean isMultiUnitProduct = false;
	
	
	
	//*******************************************************************/
	//			沽清
	/////////////////////////
	public boolean longterm = false;
	public Double soldoutCount = 0.0;


	public boolean isLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

	public Double getSoldoutCount() {
		return soldoutCount;
	}

	public void setSoldoutCount(Double soldoutCount) {
		this.soldoutCount = soldoutCount;
	}

	//*****************************************************************/
	public void setId(long id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrder(long order) {
		this.order = order;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGoods(long goods) {
		this.goods = goods;
	}

	public void setOriginPrice(long originPrice) {
		this.originPrice = originPrice;
	}

	public void setGroup(long group) {
		this.group = group;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public void setSubgroup(long subgroup) {
		this.subgroup = subgroup;
	}

	public void setSoldout(boolean soldout) {
		this.soldout = soldout;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public long getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public long getOrder() {
		return order;
	}

	public String getUnitName() {
		return unitName;
	}

	public String getName() {
		return name;
	}

	public long getGoods() {
		return goods;
	}

	public double getOriginPrice() {
		return originPrice;
	}

	public long getGroup() {
		return group;
	}

	public String getPinyin() {
		return pinyin;
	}

	public long getSubgroup() {
		return subgroup;
	}

	public boolean isSoldout() {
		return soldout;
	}

	public ProductType getProductType() {
		return productType;
	}
	
	/**
	 * 获取本菜品的私有做法
	 * @return
	 */
	public List<ProductRest> getSelfCooks(){

		List<ProductRest> selfcooks = new ArrayList<ProductRest>();

		return selfcooks;
	}


	public class ProductType {
		private long id;
		private boolean isSet;
		private long order;
		private boolean isWeight;
		private boolean isService;
		private String name;
		private boolean isSpecial;
		private boolean isCooking;
		private boolean isMarket;
		private boolean isIngredient;

		public void setId(long id) {
			this.id = id;
		}

		public void setIsSet(boolean isSet) {
			this.isSet = isSet;
		}

		public void setOrder(long order) {
			this.order = order;
		}

		public void setIsWeight(boolean isWeight) {
			this.isWeight = isWeight;
		}

		public void setIsService(boolean isService) {
			this.isService = isService;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setIsSpecial(boolean isSpecial) {
			this.isSpecial = isSpecial;
		}

		public void setIsCooking(boolean isCooking) {
			this.isCooking = isCooking;
		}

		public void setIsMarket(boolean isMarket) {
			this.isMarket = isMarket;
		}

		public void setIsIngredient(boolean isIngredient) {
			this.isIngredient = isIngredient;
		}

		public long getId() {
			return id;
		}

		public boolean isIsSet() {
			return isSet;
		}

		public long getOrder() {
			return order;
		}

		public boolean isIsWeight() {
			return isWeight;
		}

		public boolean isIsService() {
			return isService;
		}

		public String getName() {
			return name;
		}

		public boolean isIsSpecial() {
			return isSpecial;
		}

		public boolean isIsCooking() {
			return isCooking;
		}

		public boolean isIsMarket() {
			return isMarket;
		}

		public boolean isIsIngredient() {
			return isIngredient;
		}
	}


	@Override
	public String getPinyinCodes() {
		return this.pinyin;
	}
}
