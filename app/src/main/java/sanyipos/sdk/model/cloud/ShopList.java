package sanyipos.sdk.model.cloud;

import java.util.List;

/**
 * Created by ss on 2016/3/22.
 */
public class ShopList {


    public List<Brand> brands;

    //    "shops":[
//    {
//        "brand": 1, // 品牌 ID
//            "brandName": "彩虹云宝", // 品牌名称
//            "brandLogo": "logo 地址，可能为空",
//            "brandRemark": "备注，可能为空",
//            "shop": 123, // 门店编号，全局唯一
//            "shopName": "第一分店", // 门店名字
//            "shopAddress": "门店地址，可能为空"
//    }
//    ]
    public class Brand {
        public int brand;
        public String name;
        public String logo;
        public String remark;
        public List<Shop> shops;

    }

    public class Shop {
        public int shop;
        public String name;
        public String address;
    }

}
