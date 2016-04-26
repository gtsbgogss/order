package sanyipos.sdk.utils;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sanyipos.sdk.able.ISearchAble;
import sanyipos.sdk.model.rest.ProductRest;
import sanyipos.sdk.model.rest.Units;

public class SearchAlgorithm {

	public static class ProductStruct implements Comparable<ProductStruct> {
		public int degree;
		public ISearchAble p;
		public boolean similar = false;

		public ProductStruct(int degree, ISearchAble p, boolean similar) {
			this.degree = degree;
			this.p = p;
			this.similar = similar;
		}

		@Override
		public int compareTo(ProductStruct o) {
			return this.degree - o.degree;
		}
	}

	public static ProductStruct searchSingle(ISearchAble p, String destcode) {
		String pinyin = p.getPinyinCodes();

		int start = 0;
		int degree = 0;
		boolean similar = true;

		if (pinyin == null || "".equals(pinyin)) {
			similar = false;
			return new ProductStruct(degree, p, similar);
		}

		for (int i = 0; i < destcode.length(); i++) {
			char ch = destcode.charAt(i);
			int temp_degree = 0;
			boolean is_next_char_exist = false;
			for (int j = start; j < pinyin.length(); j++) {
				if (ch == pinyin.charAt(j)) {
					start = j + 1;
					if (i != 0)
						degree += temp_degree;
					is_next_char_exist = true;
					break;
				}
				temp_degree++;
			}
			if (!is_next_char_exist) {
				similar = false;
				break;
			}
		}
		return new ProductStruct(degree, p, similar);
	}

	private static List<ProductStruct> search(List<ISearchAble> products, String destcode) {
		List<ProductStruct> ps = new ArrayList<ProductStruct>();
		for (int i = 0; i < products.size(); i++) {
			ProductStruct resp = searchSingle(products.get(i), destcode);
			if (resp.similar && resp.degree == 0)
				ps.add(resp);
		}
		Collections.sort(ps);
		return ps;
	}

	/**
	 * 以ProductRest为单位查询
	 * 
	 * @param productRest
	 * @param destcode
	 * @return
	 */
	public static List<ProductRest> searchProductRest(List<ProductRest> productRest, String destcode) {
		List<ISearchAble> datas = new ArrayList<ISearchAble>();
		for (ProductRest product : productRest) {
			datas.add(product);
		}
		List<ProductStruct> result = search(datas, destcode);
		List<ProductRest> products = new ArrayList<ProductRest>();
		for (ProductStruct ps : result) {
			products.add((ProductRest) ps.p);
		}
		return products;
	}

	/**
	 * 以Units为单位查询
	 * 
	 * @param units
	 * @param destcode
	 * @return
	 */
	public static List<Units> searchUnits(List<Units> units, String destcode) {
		List<ISearchAble> datas = new ArrayList<ISearchAble>();
		for (Units product : units) {
			datas.add(product);
		}
		List<ProductStruct> result = search(datas, destcode);
		List<Units> _units = new ArrayList<Units>();
		for (ProductStruct ps : result) {
			_units.add((Units) ps.p);
		}
		return _units;
	}

	public static void main(String[] args) {
		SearchAlgorithm.searchSingle(null, "KM");
	}
}
