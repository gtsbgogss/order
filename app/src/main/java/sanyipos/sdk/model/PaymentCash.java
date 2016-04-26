package sanyipos.sdk.model;




import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


public class PaymentCash  {

	public PaymentCash() {
	}

    public void copy(PaymentCash bean) {
        if(bean!=null){
            bean.id=id;
            bean.shopId=shopId;
            bean.remark=remark;
            bean.oid=oid;
            bean.change=change;
            bean.value=value;
            bean.staffId=staffId;
            bean.billId=billId;
        }
    }

	public String toString() {
		return "\n[payment_cash]\n " + "- id = " + id + "- shopId = " + shopId + "- remark = " + remark + "- oid = " + oid + "- change = " + change + "- value = " + value
				+ "- staffId = " + staffId + "- billId = " + billId;
	}

    public void clear() {
        id=null;
        shopId=null;
        remark=null;
        oid=null;
        change=null;
        value=null;
        staffId=null;
        billId=null;
    }


    @SerializedName("id")
    public Long id;    


    @SerializedName("shop_id")
    public Long shopId;    


    @SerializedName("remark")
    public String remark;    


    @SerializedName("oid")
    public Integer oid;    


    @SerializedName("change")
    public Integer change;    


    @SerializedName("value")
    public Double value;    


    @SerializedName("staff_id")
    public Long staffId;    


    @SerializedName("bill_id")
    public Long billId;    

	public boolean isTemp = false;

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public static PaymentCash fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, PaymentCash.class);
	}

}
