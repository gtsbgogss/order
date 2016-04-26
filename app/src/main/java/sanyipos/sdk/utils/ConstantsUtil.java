package sanyipos.sdk.utils;

public class ConstantsUtil {
    public static boolean isDebug = true;
    public static final String PULL_ACTION = "com.sanyipos.smartpos.action.PULL_OPERATION_DATA";
    public static final String REQUEST_METHOD_GET = "GET";
    public static final String REQUEST_METHOD_POST = "POST";
    public static final String REQUEST_METHOD_DELETE = "DELETE";
    public static final int RESPONSE_SUCCESS = 0;
    public static final int RESPONSE_EXCEPTION = 400;
    public static final int RESPONSE_FAIL = 408;
    public static final int RESPONSE_TIMEOUT = 409;
    public static final int NOTIFICATION_RESTAURANT_UPDATE = 1;
    public static final int NOTIFICATION_SET_SOLD_OUT = 2;
    public static final int NOTIFICATION_CLEAR_SOLD_OUT = 3;
    public static final int NOTIFICATION_TABLE_UNLOCKED = 4;
    public static final int NOTIFICATION_NEW_VERSION = 5;
    public static final int NOTIFICATION_PASSWORD_CHANGED = 6;
    public static final int NOTIFICATION_SHOP_CLOSED = 7;
    public static final int NOTIFICATION_SHOP_OPENED = 8;
    public static final int NOTIFICATION_SHOP_IN_MAINTAINECE = 9;
    public static final int NOTIFICATION_SHOP_CLOSING = 10;

    public static final long SHOP_OPENED = 0;
    public static final long SHOP_CLOSED = 1;
    public static final long SHOP_IN_MAINTAINECE = 2;
    public static final long SHOP_CLOSING = 3;

    public static final int SYSTEM_AUTO_TIME = 1;
    public static final int SYSTEM_AUTO_TIME_ZONE = 1;

    public static final int SEAT_DEFAULT = 0;
    public static final int SEAT_A = 1;
    public static final int SEAT_B = 2;
    public static final int SEAT_C = 3;
    public static final int SEAT_D = 4;
    public static final int SEAT_E = 5;
    public static final int SEAT_F = 6;
    public static final int SEAT_G = 7;
    public static final int SEAT_H = 8;

    public static final int SURCHARGE_BY_PERCENTAGE = 1;
    public static final int SURCHARGE_BY_FIX_AMOUNT = 2;
    public static final int SURCHARGE_BY_TIME = 3;

    public static final int FLATFORM_ANDROID = 1;

    public static final String agentUrlTemplate = "http://{ip}/smartpos/";

    public static final String TIMELOG_NEWBILL = "A";
    public static final String TIMELOG_ENTERBILL = "B";
    public static final String TIMELOG_ORDERPLACE = "C";
    public static final String TIMELOG_ENTERCHECK = "D";

    public static final String HEADER_REQUEST = "Sanyi-Request-Handle-Start-Time";
    public static final String HEADER_RESPONSE = "Sanyi-Request-Handle-End-Time";
    public static final String HEADER_DURATION = "Sanyi-Request-Duration-Time";

    public static final long MONITORING_START = 1;
    public static final long MONITORING_STOP = 0;

    public static final long CLOUD_CONNECT_NORMOL = 0;
    public static final long CLOUD_CONNECT_ERROR = 1;

    public static final long PROMOTION_TYPE_MEMBER_PRICE = 10;
    public static final long PROMOTION_TYPE_DISCOUNT_PROMOTION = 11;

    public static final long PRODUCT_TYPE_COOK_METHOD = 7;

    public static final long AUTOGOTOCOOKING = 1;
    public static final long NOTAUTOGOTOCOOKING = 0;

    // staff permission
    public static final int PERMISSION_REVERSE_BILL = 1; // 逆结权限
    public static final int PERMISSION_CASHIER = 2; // 结账（收银）权限
    public static final int PERMISSION_SHOP_CLOSE = 3; // 餐厅打烊
    public static final int PERMISSION_DISH_READINESS = 4; //
    public static final int PERMISSION_ORDER = 5; // 下单权限
    public static final int PERMISSION_REPORT = 6; //
    public static final int PERMISSION_FREE_DISH = 7; // 赠菜权限
    public static final int PERMISSION_CHANGE_PRICE = 8; // 改价权限
    public static final int PERMISSION_FREE_BILL = 9; // 免单权限
    public static final int PERMISSION_CREDIT_BILL = 10; //
    public static final int PERMISSION_RETURN_DISH = 11; // 退菜权限
    public static final int PERMISSION_PRE_PRINTER = 12; // 预打印权限
    public static final int PERMISSION_MEMBER_QUERY = 13; // 会员查询
    public static final int PERMISSION_MEMBER_HAND_OUT_CARD = 14; // 会员发卡
    public static final int PERMISSION_MEMBER_RETURN_CARD = 15; // 会员退卡
    public static final int PERMISSION_MEMBER_RECHARGE = 16; // 会员充值
    public static final int PERMISSION_MEMBER_TRANSFER = 17; // 会员转账

    // promotion type
    public final static int PROMOTION_SPECIAL = 1; // 特价
    public final static int PROMOTION_BUY_GET_PRODUCT = 2; //
    public final static int PROMOTION_BUY_GET_VOUCHER = 3; //
    public final static int PROMOTION_BUY_GET_COUPON = 4; //
    public final static int PROMOTION_SPEND_FOR_LESS = 5; //
    public final static int PROMOTION_BUY_PAY_GET_PRODUCT = 6; //
    public final static int PROMOTION_MANUAL_VOUCHER = 7; //
    public final static int PROMOTION_MANUAL_COUPON = 8; //
    public final static int PROMOTION_GROUP_BUY = 9; //
    public final static int PROMOTION_GROUP_BUY_VOUCHER = 10; //
    public final static int PROMOTION_EXECUTION_TYPE_IN_ORDER = 1; //
    public final static int PROMOTION_EXECUTION_TYPE_ASK = 2; //
    public final static int PROMOTION_EXECUTION_TYPE_IN_CHECK = 3; //

    // 促销活动类型
    public final static int PROMOTION_TYPE_MEMBERCHARGE = 9; // 会员充值营销
    public final static int PROMOTION_TYPE_MEMBERPRICE = 10; // 会员价（不需要岗位授权）
    public final static int PROMOTION_TYPE_DISCOUNT = 11; // 打折促销（需要岗位授权）

    public final static int DISH_HOLD = 110;
    public final static int DISH_PROCESSING = 111;
    public final static int DISH_IN_KICHEN = 112;
    public final static int DISH_DONE = 113;

    // system product type
    public static final int PRODUCT_TYPE_NORMAL = 1; // 普通
    public static final int PRODUCT_TYPE_WEIGHT = 2; // 称重
    public static final int PRODUCT_TYPE_NOWPRICE = 3; // 时价
    public static final int PRODUCT_TYPE_SET = 4; // 套餐
    public static final int PRODUCT_TYPE_SPECIAL = 5; // 特价
    public static final int PRODUCT_TYPE_INGREDIENT = 6; // 加料
    public static final int PRODUCT_TYPE_COOKMETHOD = 7; // 做法

    // 支付类型
    public static final int PAYMENT_CASH = 1; // 现金
    public static final int PAYMENT_BANK_CARD = 2; // 银行卡
    public static final int PAYMENT_STORE_VALUE = 3;
    public static final int PAYMENT_ALIPAY = 4; // 支付宝
    public static final int PAYMENT_WECHAT = 5; // 微信
    public static final int PAYMENT_VOUCHER = 6; // 代金券
    public static final int PAYMENT_DISCOUNT = 7; // 折扣
    public static final int PAYMENT_WAIVE = 8; // 免单
    public static final int PAYMENT_DEBIT = 9;
    public static final int PAYMENT_NOCENT = 10; // 抹零
    public static final int PAYMENT_MINCHARGE = 11; // 最低消费
    public static final int PAYMENT_PROMOTION = 12; // 促销活动
    public static final int PAYMENT_SURCHARGE = 13; // 服务费
    public static final int PAYMENT_CUSTOM = 14; // 自定义收银方式
    public static final int PAYMENT_DERATE = 15; //减免

    public static final String KEY_CLOUD = "api_url"; // 云端
    public static final String KEY_TENPAY = "tenpay_url";// 微信支付
    public static final String KEY_ALIPAY = "alipay_url";// 支付宝支付
    public static final String KEY_MEMBER = "website_url";// 会员

    public static final String KEY_MODE = "mode"; // Prod 生产环境 、test测试环境、、 dev

    // 开发环境、、demo demo环境

    public static final String ENVIRONMENT_TEST = "Test";
    public static final String ENVIRONMENT_PROD = "Prod";

    public static final String REFRESH_WS = "websocket";
    public static final String REFRESH_POLL = "poll";
    public static final String SOCKET_ACTION = "action";
    public static final String SOCKET_MESSAGE = "message";
    public static final String SOCKET_ACTION_REFRESH = "realtime";
    public static final String SOCKET_ACTION_PRINT = "print";
    public static final String SOCKET_TAG = "tag";

    //桌子状态
    public static final int AVAILABLE = 1;        //空台
    public static final int SERVING = 2;        //服务中
    public static final int PREPRINT = 4;        //预打印
    public static final int MERGE = 8;            //并台
    public static final int SPLIT = 16;            //拆台
    public static final int RESERVE = 128;        //逆结
    public static final int OVERTIME = 64;        //超时


    public static final String QRCODETOOLS = "http://tongbao.sanyipos.com/tool/qrcode?code=";

    /**
     * all 、 mobile 、  rfid 、  card  、 sn
     */

    public static enum Member {
        all, mobile, rfid, card, sn
    }
}
