package sanyipos.sdk.model.rest;


import java.util.ArrayList;
import java.util.List;

/**
 * 一个套餐
 * @author admin
 *
 */
public class GoodsSet {
	private ProductRest product;
	private List<SetItems> items;

	public void setProduct(ProductRest product) {
		this.product = product;
	}

	public void setItems(List<SetItems> items) {
		this.items = items;
	}

	public ProductRest getProduct() {
		return product;
	}

	public List<SetItems> getItems() {
		return items;
	}

	/**
	 * 道菜一项
	 * @author admin
	 *
	 */
	public static class SetItems {
		private long id;
		private List<SetItemDetails> details;
		private String name;

		public void setId(long id) {
			this.id = id;
		}

		public void setDetails(List<SetItemDetails> details) {
			this.details = details;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getId() {
			return id;
		}

		public List<SetItemDetails> getDetails() {
			return details;
		}

		public String getName() {
			return name;
		}

		/**
		 * 道菜中的可选菜品详细信息
		 * @author admin
		 *
		 */
		public static class SetItemDetails {
			private boolean isDefault;
			private String name;
			private long goods;
			private long quantity;
			private long plusPrice;
			private long unitType;
			private String unitTypeName;
			private boolean isMulti;
			private List<Long> subProducts;
			
			
			public boolean isMulti() {
				return isMulti;
			}

			public void setMulti(boolean isMulti) {
				this.isMulti = isMulti;
			}

			public void setIsDefault(boolean isDefault) {
				this.isDefault = isDefault;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setGoods(long goods) {
				this.goods = goods;
			}

			public void setQuantity(long quantity) {
				this.quantity = quantity;
			}

			public void setPlusPrice(long plusPrice) {
				this.plusPrice = plusPrice;
			}

			public boolean isIsDefault() {
				return isDefault;
			}

			public String getName() {
				return name;
			}

			public long getGoods() {
				return goods;
			}

			public long getQuantity() {
				return quantity;
			}

			public long getPlusPrice() {
				return plusPrice;
			}

			public boolean isDefault() {
				return isDefault;
			}

			public void setDefault(boolean isDefault) {
				this.isDefault = isDefault;
			}

			public List<Long> getSubProducts() {
				return subProducts;
			}

			public void setSubProducts(List<Long> subProducts) {
				this.subProducts = subProducts;
			}
			
			

            public long getUnitType() {
				return unitType;
			}

			public void setUnitType(long unitType) {
				this.unitType = unitType;
			}

			public String getUnitTypeName() {
				return unitTypeName;
			}

			public void setUnitTypeName(String unitTypeName) {
				this.unitTypeName = unitTypeName;
			}

			public List<ProductRest> getSelfCooks(){
                List<ProductRest> selfcooks = new ArrayList<ProductRest>();
//                if(SanyiSDK.rest.cooking == null) return selfcooks;
//                for(ProductRest product: SanyiSDK.rest.cooking.getAllProducts())
//                    for (Long id : subProducts) {
//                        if (product.getId() == id) {
//                            selfcooks.add(product);
//                        }
//                    }
                return selfcooks;
            }
			
		}
	}
}