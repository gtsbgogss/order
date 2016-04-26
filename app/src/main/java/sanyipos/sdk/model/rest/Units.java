package sanyipos.sdk.model.rest;


import java.util.List;

import sanyipos.sdk.able.ISearchAble;

public class Units extends ISearchAble {

	public Long id;

	public String name;

	//public Long group;

	//public Long subgroup;
	
	public Boolean isMulti;

	public List<ProductRest> products;
	
	/**
	 * 初始化
	 * 1、初始化多规格子菜，让子菜也知道自己是多规格的
	 */
	public void init(){
		for(ProductRest p: products){
			p.isMultiUnitProduct = this.isMulti;
		}
	}
	
	/**
	 * 是否是多规格菜品
	 * @return
	 */
	public boolean isMultiUnits(){
		return products != null && products.size() > 1;
	}

	@Override
	public String getPinyinCodes() {
		return this.products.get(0).pinyin;
	}
	
	/**
	 * 获取最大价格
	 * @return
	 */
	public double getMaxPrice(){
		double price = this.products.get(0).price;
		if(isMultiUnits()){
			for(ProductRest p: products){
				if(price < p.price){
					price = p.price;
				}
			}
		}
		return price;
	}
	
	/**
	 * 获取最低价格
	 * @return
	 */
	public double getMinPrice(){
		double price = this.products.get(0).price;
		if(isMultiUnits()){
			for(ProductRest p: products){
				if(price > p.price){
					price = p.price;
				}
			}
		}
		return price;
	}
	
	
}
