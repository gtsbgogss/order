package sanyipos.sdk.model.preorder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class PreOrder {
	
	@SerializedName("id")
	public Long id;
	
	@SerializedName("shop_id")
	public Long shop_id;
	
	@SerializedName("table_id")
	public Long table_id;
	
	@SerializedName("seat_id")
	public Long table_seat_id;
	
	@SerializedName("sn")
	public Integer sn;
	
	@SerializedName("person_count")
	public Integer person_count;
	
	@SerializedName("remark")
	public String remark;
	
	@SerializedName("state_id")
	public Integer state_id;
	
	@SerializedName("create_on")
	public Date create_on;
	
	@SerializedName("details")
	public List<PreOrderDetail> preOrderDetails;
	
	public void copy(PreOrder bean) {
        if(bean!=null){
            bean.id=id;
            bean.shop_id=shop_id;
            bean.table_id=table_id;
            bean.remark=remark;
            bean.table_id=table_id;
            bean.sn=sn;
            bean.person_count=person_count;
            bean.state_id=state_id;
            bean.create_on=create_on;
            bean.preOrderDetails = preOrderDetails;
        }
    }
	
	public void clear() {
        id=null;
        shop_id=null;
        table_id=null;
        table_seat_id=null;
        sn=null;
        person_count=null;
        remark=null;
        state_id=null;
        create_on=null;
        preOrderDetails = null;
    }
	
	public static PreOrder fromJson(String json){
        Gson gson = new GsonBuilder()
        .serializeNulls()
        .create();
        
        return gson.fromJson(json,  PreOrder.class  );
    }

}
