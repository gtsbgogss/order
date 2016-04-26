package sanyipos.sdk.model.cloud;

/**
 * Created by ss on 2016/3/22.
 */
public class ShopListParam {
//    {
//        "token": "AddDEFddaddf",  // 会话 ID
//            "uuid": "1123dadf1234fsad" // 收银机的唯一标识
//    }

    public ShopListParam(String token,String uuid){
        this.token = token;
        this.uuid = uuid;
    }
    public String token;
    public String uuid;

}
