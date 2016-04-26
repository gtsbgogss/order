package sanyipos.sdk.model;




import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


public class PaymentDebit  {

	public PaymentDebit() {
	}

    public void copy(PaymentDebit bean) {
        if(bean!=null){
            bean.id=id;
            bean.shopId=shopId;
            bean.remark=remark;
            bean.oid=oid;
            bean.value=value;
            bean.staffId=staffId;
            bean.billId=billId;
            bean.memberId=memberId;
        }
    }

	public String toString() {
		return "\n[payment_debit]\n " + "- id = " + id + "- shopId = " + shopId + "- remark = " + remark + "- oid = " + oid + "- value = " + value + "- staffId = " + staffId
				+ "- billId = " + billId + "- memberId = " + memberId;
	}

    public void clear() {
        id=null;
        shopId=null;
        remark=null;
        oid=null;
        value=null;
        staffId=null;
        billId=null;
        memberId=null;
    }


    @SerializedName("id")
    public Long id;    


    @SerializedName("shop_id")
    public Long shopId;    


    @SerializedName("remark")
    public String remark;    


    @SerializedName("oid")
    public Integer oid;    


    @SerializedName("value")
    public Double value;    


    @SerializedName("staff_id")
    public Long staffId;    


    @SerializedName("bill_id")
    public Long billId;    


    @SerializedName("member_id")
    public Long memberId;    

	public boolean isTemp = false;

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public static PaymentDebit fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, PaymentDebit.class);
	}

}
