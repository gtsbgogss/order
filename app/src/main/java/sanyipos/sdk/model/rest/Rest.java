package sanyipos.sdk.model.rest;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sanyipos.sdk.model.BrandServiceHour;
import sanyipos.sdk.model.OperationData;
import sanyipos.sdk.model.SeatEntity;
import sanyipos.sdk.model.WaiveRemark;
import sanyipos.sdk.utils.ConstantsUtil;
import sanyipos.sdk.utils.DateHelper;

public class Rest {

    public Config config;

    public List<WaiveRemark> waiveRemarks;

    public List<IDType> idTypes;

    public List<BrandServiceHour> serviceHours;

    public List<MemberTypes> memberTypes;

    public List<GoodsGroup> normals;

    public List<TableGroup> tableGroups;

    /**
     * 特价
     */
    public GoodsGroup special;

    /**
     * 大类：套餐，里面包含子类
     */
    public GoodsGroup set;

    /**
     * 做法
     */
    public GoodsGroup cooking;

    /**
     * 加料
     */
    public GoodsGroup ingredient;

    /**
     * 套餐菜品和里面的道菜信息（包括可选道菜信息） 一个GoodsSet代表一个套餐
     */
    public List<GoodsSet> goodsSets;

    public OperationData operationData;

    public List<StaffRest> staffs;

    /**
     * *********************************************************************
     * 所有的大类
     */
    public List<GoodsGroup> goodsGroup = new ArrayList<GoodsGroup>();

    public List<GoodsGroup> getGoodsGroup() {
        return goodsGroup;
    }

    public void setGoodsGroup(List<GoodsGroup> goodsGroup) {
        this.goodsGroup = goodsGroup;
    }

    /**
     * *********************************************************************
     * 所有菜品
     */
    public List<Units> products = new ArrayList<Units>();


    public List<Units> getUnits() {
        return products;
    }

    public void setUnits(List<Units> units) {
        this.products = units;
    }

    /**
     * 所有菜品（全部展开）
     */
    public List<ProductRest> unford_products = new ArrayList<ProductRest>();

    /*************************************************************************
     * 通过productId 找product
     *
     * @param productId
     * @return
     */
    public ProductRest getProductById(long productId) {
//		for (GoodsGroup group : goodsGroup) {
//			for (SubGroupsRest subRest : group.getSubgroups()) {
//				for (Units unit : subRest.units) {
//					for (ProductRest product : unit.products)
//						if (product.getId() == productId) {
//							return product;
//						}
//				}
//			}
//		}
        for (Units unit : products) {
            if (unit.products != null && unit.products.size() > 0) {
                for (ProductRest product : unit.products) {
                    if (product.getId() == productId) {
                        return product;
                    }
                }
            }
        }
        return null;
    }

    public GoodsSet.SetItems.SetItemDetails getSetItemByGoodsId(long goodsId) {
        if (goodsSets != null) {
            for (GoodsSet set : goodsSets) {
                for (GoodsSet.SetItems item : set.getItems()) {
                    for (GoodsSet.SetItems.SetItemDetails itemDetail : item.getDetails()) {
                        if (itemDetail.getGoods() == goodsId) {
                            return itemDetail;
                        }
                    }
                }
            }
        }
        return null;
    }


    /**
     * 获取套餐道菜中的某个菜品的私有做法
     *
     * @param setId
     * @param setItemId
     * @param setItemDetailGoodsId
     * @return 没找到或者没有都返回空的List
     */
    public List<ProductRest> getSetItemSelfCooks(long setItemDetailGoodsId) {
        List<ProductRest> cooks = new ArrayList<ProductRest>();
        if (goodsSets != null) {
            for (GoodsSet set : goodsSets) {
                for (GoodsSet.SetItems item : set.getItems()) {
                    for (GoodsSet.SetItems.SetItemDetails detail : item.getDetails()) {
                        if (detail.getGoods() == setItemDetailGoodsId) {
                            // 找到道菜
                            return detail.getSelfCooks();
                        }
                    }
                }
            }
        }
        return cooks;
    }

    public TableGroup getTableGroupById(long tableGroupId) {
        for (TableGroup tableGroup : tableGroups) {
            if (tableGroup.id == tableGroupId) {
                return tableGroup;
            }
        }
        return null;
    }

    public String getServiceHourNameByTime(Date time) {
        String hour = "非营业时段";
        for (BrandServiceHour sh : serviceHours) {
            if (DateHelper.compareTimes(time, sh.beginTime, sh.endTime)) {
                return sh.name;
            }
        }
        return hour;
    }

    /**
     * 获取所有的大类（除去做法和加料） 并进行排序
     *
     * @return
     */
    public void initAllGoodsGroup() {
        if (special != null) {
            goodsGroup.add(special);
        }
        goodsGroup.addAll(normals);
        if (set != null) {
            goodsGroup.add(set);
        }
        Collections.sort(goodsGroup, new Comparator<GoodsGroup>() {

            @Override
            public int compare(GoodsGroup o1, GoodsGroup o2) {
                if (o1.order > o2.order) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }

    /**
     * 获取所有菜品（除去加料和做法）
     *
     * @return
     */
    public void initAllProducts() {
        for (GoodsGroup group : goodsGroup) {
            SubGroupsRest allsubGroups = new SubGroupsRest();
            allsubGroups.group = group.id;
            allsubGroups.name = "全部";
            allsubGroups.order = -1;
            allsubGroups.id = group.id;
            allsubGroups.units = new ArrayList<Units>();
            for (SubGroupsRest subgroup : group.subgroups) {
                if (group.subgroups.size() > 1) allsubGroups.units.addAll(subgroup.units);
                products.addAll(subgroup.units);
                for (Units unit : subgroup.units) {
                    unit.init();
                    unford_products.addAll(unit.products);
                }
            }
            if (group.subgroups.size() > 1) {
                group.subgroups.add(0, allsubGroups);
            }
        }
    }

    /**
     * 获取所有沽清的菜品
     */
    public List<ProductRest> getAllSoldDish() {
        List<ProductRest> soldList = new ArrayList<ProductRest>();
        for (Units unit : products) {
            for (ProductRest product : unit.products) {
                if (product.soldout && !product.isLongterm()) {
                    if (!soldListHasProduct(product, soldList))
                        soldList.add(product);
                }
            }
        }
        return soldList;
    }

    public boolean soldListHasProduct(ProductRest productRest, List<ProductRest> soldList) {
        if (soldList.isEmpty()) return false;
        for (ProductRest soldPro : soldList) {
            if (soldPro.getId() == productRest.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取所有停售的菜品
     */
    public List<ProductRest> getAllStopSellDish() {
        List<ProductRest> soldList = new ArrayList<ProductRest>();
        for (Units unit : products) {
            for (ProductRest product : unit.products) {
                if (product.isLongterm()) {
                    if (!soldListHasProduct(product, soldList))
                        soldList.add(product);
                }
            }
        }
        return soldList;
    }

    /**
     * 设置菜品是否估清
     *
     * @param productId
     * @param isSoldOut
     */
    public void setSoldOutProduct(boolean isSoldOut, long productId) {
        ProductRest pt = getProductById(productId);
        if (pt != null) {
            pt.setSoldout(isSoldOut);
        }
    }

    // ********************************
    public void initRestData() {
        initAllGoodsGroup();
        initAllProducts();
        initPublicCookMethod();
        initIngredient();

    }

    /**
     * 通过大类id获取菜品大类
     *
     * @param goodsGroupId
     * @return
     */
    public GoodsGroup getGoodsGroup(long goodsGroupId) {
        for (GoodsGroup mGoodsGroup : goodsGroup) {
            if (mGoodsGroup.id == goodsGroupId) {
                return mGoodsGroup;
            }
        }
        return null;
    }

    /**
     * 通过小类id获取菜品小类
     *
     * @param subGroupId
     * @return
     */
    public SubGroupsRest getSubGroupsRest(long subGroupId) {
        for (GoodsGroup mGoodsGroup : goodsGroup) {
            for (SubGroupsRest subGroupsRest : mGoodsGroup.getSubgroups()) {
                if (subGroupId == subGroupsRest.id) {
                    return subGroupsRest;
                }
            }
        }
        return null;
    }

    /**
     * 获取大类里的所有菜品
     *
     * @param goodsGroupId
     * @return
     */
    public List<Units> getDishByGoodsGroupId(long goodsGroupId) {
        List<Units> productRests = new ArrayList<Units>();
        for (GoodsGroup mGoodsGroup : goodsGroup) {
            if (mGoodsGroup.id == goodsGroupId) {
                for (SubGroupsRest subGroupsRest : mGoodsGroup.getSubgroups()) {
                    productRests.addAll(subGroupsRest.units);
                }
            }
        }
        return productRests;
    }

    public List<ProductRest> publicCooks;

    /**
     * 获取全部做法
     *
     * @return
     */
    public void initPublicCookMethod() {
        publicCooks = new ArrayList<ProductRest>();
        if (cooking != null) {
            for (SubGroupsRest subGroupsRest : cooking.subgroups) {
                for (Units unit : subGroupsRest.units) {
                    publicCooks.addAll(unit.products);
                }
            }
        }

    }

    public List<ProductRest> ingredients;

    /**
     * 获取全部加料
     *
     * @return
     */
    public void initIngredient() {
        ingredients = new ArrayList<ProductRest>();
        if (ingredient != null) {
            for (SubGroupsRest subGroupsRest : ingredient.subgroups) {
                for (Units unit : subGroupsRest.units) {
                    ingredients.addAll(unit.products);
                }
            }
        }
    }

    public List<TableGroup> getTableGroups() {
        List<TableGroup> hasTableGroups = new ArrayList<TableGroup>();
        for (TableGroup tableGroup : tableGroups) {
            if (isFloorHasTable(tableGroup)) {
                hasTableGroups.add(tableGroup);
            }
        }
        return hasTableGroups;
    }

    public boolean isFloorHasTable(TableGroup tableGroup) {
        boolean flag = false;
        for (int i = 0; i < operationData.shopTables.size(); ++i) {
            SeatEntity obj = operationData.shopTables.get(i);
            if (tableGroup.id.equals(obj.tableGroup)) {
                flag = true;
            }
        }
        return flag;
    }

    public List<Map<String, List<SeatEntity>>> combineTables;
    public List<VirtualTable> virtualTables;

    /**
     * 并台分组
     */
    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public void initCombineTables() {
        combineTables = new ArrayList<Map<String, List<SeatEntity>>>();
        virtualTables = new ArrayList<VirtualTable>();
        for (SeatEntity table : operationData.shopTables) {
            if (((table.state & ConstantsUtil.MERGE) == ConstantsUtil.MERGE) && (table.order.tag != null) && (!table.order.tag.isEmpty())) {
                if (!isTagExist(table.order.tag)) {
                    VirtualTable combineTable = new VirtualTable();
                    combineTable.tag = table.order.tag;
                    combineTable.isChooseCombine = false;
                    virtualTables.add(combineTable);
                }
            }
        }
        for (VirtualTable combineTable : virtualTables) {
            Map<String, List<SeatEntity>> map = new HashMap<String, List<SeatEntity>>();
            List<SeatEntity> cTables = new ArrayList<SeatEntity>();
            for (SeatEntity table : operationData.shopTables) {
                if (((table.state & ConstantsUtil.MERGE) == ConstantsUtil.MERGE) && (table.order.tag != null) && (!table.order.tag.isEmpty())) {
                    if (table.order.tag.equals(combineTable.tag)) {
                        cTables.add(table);
                    }
                }
            }
            map.put(combineTable.tag, cTables);
            combineTables.add(map);
        }
    }

    /**
     * 判断虚拟餐桌是否存在
     *
     * @param tag
     * @return
     */
    public boolean isTagExist(String tag) {
        boolean flag = false;
        for (VirtualTable virtualTable : virtualTables) {
            if (virtualTable.tag.equals(tag)) {
                return true;
            }
        }
        return flag;
    }

    /**
     * 通过tag获取此tag内的所有table
     *
     * @param tag
     * @return
     */
    public List<SeatEntity> getCombineTablesByTag(String tag) {
        int position = -1;
        for (int i = 0; i < virtualTables.size(); i++) {
            String str = virtualTables.get(i).tag;
            if (str.equals(tag)) {
                position = i;
            }
        }
        if (position > -1) {
            return combineTables.get(position).get(tag);
        }
        return null;
    }

    public SeatEntity getTableById(long tableId) {
        for (SeatEntity table : operationData.shopTables) {
            if (table.seat == tableId) {
                return table;
            }
        }
        return null;
    }

    /**
     * 通过tableId获取此tag内的所有table
     *
     * @param tag
     * @return
     */
    @SuppressLint("NewApi")
    public List<SeatEntity> getCombineTablesById(long tableId) {
        for (SeatEntity table : operationData.shopTables) {
            if (table.seat == tableId) {
                if ((table.order.tag != null) && (!table.order.tag.isEmpty())) {
                    return getCombineTablesByTag(table.order.tag);
                }
            }
        }
        return null;
    }

    /**
     * 通过tableId获取此tag内的所有tableId
     *
     * @param tag
     * @return
     */
    public List<Long> getCombineTableIdsById(long tableId) {
        List<SeatEntity> tables = getCombineTablesById(tableId);
        List<Long> ids = new ArrayList<Long>();
        if (tables != null && tables.size() > 0) {
            for (SeatEntity seat : tables) {
                ids.add(seat.seat);
            }
            return ids;
        } else
            return null;
    }

    /**
     * 通过tag获取此tag内的所有tableId
     *
     * @param tag
     * @return
     */
    public List<Long> getCombineTableIdsByTag(String tag) {
        List<SeatEntity> tables = getCombineTablesByTag(tag);
        List<Long> ids = new ArrayList<Long>();
        if (tables != null && tables.size() > 0) {
            for (SeatEntity seat : tables) {
                ids.add(seat.seat);
            }
            return ids;
        } else
            return null;
    }

    /*
     * 通过并台标志获取虚拟餐桌
     */
    public VirtualTable getVirtualTableByTag(String tag) {
        for (VirtualTable virtualTable : virtualTables) {
            if (tag.equals(virtualTable.tag)) {
                return virtualTable;
            }
        }
        return null;
    }

    public ProductRest getCookById(long id) {
        for (ProductRest cook : publicCooks) {
            if (cook.getId() == id) {
                return cook;
            }
        }
        return null;
    }

    public ProductRest getIngredientById(long id) {
        for (ProductRest ingredient : ingredients) {
            if (ingredient.getId() == id) {
                return ingredient;
            }
        }
        return null;
    }


    /**
     * +
     * <p/>
     * 通过TAG 组成当前并台餐桌的名字
     *
     * @param tag
     * @return
     */
    public String getCombineTableNameByTag(String tag) {
        String name = "";
        List<SeatEntity> tables = getCombineTablesByTag(tag);
        if (tables != null) {
            for (SeatEntity table : tables) {
                if (table.tableName != null) {
                    name = name + table.tableName + ",";
                }
            }
        }
        return (name != null) ? name.substring(0, name.length() - 1) : "";
    }
}