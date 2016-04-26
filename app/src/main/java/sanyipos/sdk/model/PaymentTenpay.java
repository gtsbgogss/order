package sanyipos.sdk.model;




import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


public class PaymentTenpay  {

	public PaymentTenpay() {
	}

    public void copy(PaymentTenpay bean) {
        if(bean!=null){
            bean.id=id;
            bean.transcationId=transcationId;
            bean.shopId=shopId;
            bean.remark=remark;
            bean.oid=oid;
            bean.value=value;
            bean.billId=billId;
            bean.staffId=staffId;
        }
    }

	public String toString() {
		return "\n[payment_tenpay]\n " + "- id = " + id + "- transcationId = " + transcationId + "- shopId = " + shopId + "- remark = " + remark + "- oid = " + oid + "- value = "
				+ value + "- billId = " + billId;
	}

    public void clear() {
        id=null;
        transcationId=null;
        shopId=null;
        remark=null;
        oid=null;
        value=null;
        billId=null;
    }


    @SerializedName("id")
    public Long id;    


    @SerializedName("transcation_id")
    public String transcationId;    


    @SerializedName("shop_id")
    public Long shopId;    


    @SerializedName("remark")
    public String remark;    


    @SerializedName("oid")
    public Integer oid;    


    @SerializedName("value")
    public Double value;    


    @SerializedName("bill_id")
    public Long billId;    

    @SerializedName("staff_id")
    public Long staffId;

	public boolean isTemp = false;

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public static PaymentTenpay fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, PaymentTenpay.class);
	}

}
