package sanyipos.sdk.model;




import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


public class BrandServiceHour  {

    public BrandServiceHour() { }

    public void copy(BrandServiceHour bean) {
        if(bean!=null){
            bean.id=id;
            bean.beginTime=beginTime;
            bean.remark=remark;
            bean.endTime=endTime;
            bean.oid=oid;
            bean.name=name;
            bean.brandId=brandId;
        }
    }

    public String toString() {
        return   "\n[brand_service_hour]\n "
            + "- id = " + id
            + "- beginTime = " + beginTime
            + "- remark = " + remark
            + "- endTime = " + endTime
            + "- oid = " + oid
            + "- name = " + name
            + "- brandId = " + brandId
            ;
    }

    public void clear() {
        id=null;
        beginTime=null;
        remark=null;
        endTime=null;
        oid=null;
        name=null;
        brandId=null;
    }


    @SerializedName("id")
    public Long id;    


    @SerializedName("beginTime")
    public java.util.Date beginTime;    


    @SerializedName("remark")
    public String remark;    


    @SerializedName("endTime")
    public java.util.Date endTime;    


    @SerializedName("oid")
    public Integer oid;    


    @SerializedName("name")
    public String name;    


    @SerializedName("brand")
    public Long brandId;    




    public static BrandServiceHour fromJson(String json){
        Gson gson = new GsonBuilder()
        .serializeNulls()
        .create();
        
        return gson.fromJson(json,  BrandServiceHour.class  );
    }

}
