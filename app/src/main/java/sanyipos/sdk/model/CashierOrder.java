package sanyipos.sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class CashierOrder  {

    public CashierOrder() { }

    public void copy(CashierOrder bean) {
        if(bean!=null){
            bean.id=id;
            bean.sn=sn;
            bean.shopId=shopId;
            bean.remark=remark;
            bean.oid=oid;
            bean.createOn=createOn;
            bean.personCount=personCount;
            bean.tableSeatId=tableSeatId;
            bean.billId=billId;
        }
    }

    public String toString() {
        return   "\n[cashier_order]\n "
            + "- id = " + id
            + "- sn = " + sn
            + "- shopId = " + shopId
            + "- remark = " + remark
            + "- oid = " + oid
            + "- createOn = " + createOn
            + "- personCount = " + personCount
            + "- tableSeatId = " + tableSeatId
            + "- billId = " + billId
            ;
    }

    public void clear() {
        id=null;
        sn=null;
        shopId=null;
        remark=null;
        oid=null;
        createOn=null;
        personCount=null;
        tableSeatId=null;
        billId=null;
    }


    @SerializedName("id")
    public Long id;    


    @SerializedName("sn")
    public String sn;    


    @SerializedName("shop_id")
    public Long shopId;    


    @SerializedName("remark")
    public String remark;    


    @SerializedName("oid")
    public Integer oid;    


    @SerializedName("create_on")
    public java.util.Date createOn;    


    @SerializedName("person_count")
    public Integer personCount;    


    @SerializedName("table_seat_id")
    public Long tableSeatId;    


    @SerializedName("bill_id")
    public Long billId;    




    public static CashierOrder fromJson(String json){
        Gson gson = new GsonBuilder()
        .serializeNulls()
        .create();
        
        return gson.fromJson(json,  CashierOrder.class  );
    }

}
