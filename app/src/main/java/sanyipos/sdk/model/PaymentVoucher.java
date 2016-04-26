package sanyipos.sdk.model;




import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class PaymentVoucher  {

	public PaymentVoucher() {
	}

	public void copy(PaymentVoucher bean) {
		if (bean != null) {
			bean.id = id;
			bean.voucherId = voucherId;
			bean.shopId = shopId;
			bean.remark = remark;
			bean.oid = oid;
			bean.value = value;
			bean.billId = billId;
			bean.change = change;
			bean.staffId = staffId;
			bean.sn = sn;
			bean.voucherTypeId = voucherTypeId;
		}
	}

	public String toString() {
		return "\n[payment_voucher]\n " + "- id = " + id + "- voucherId = " + voucherId + "- shopId = " + shopId + "- remark = " + remark + "- oid = " + oid + "- value = " + value + "- billId = "
				+ billId + "- change = " + change + "- voucher_type_id =" + voucherTypeId;
	}

	public void clear() {
		id = null;
		voucherId = null;
		shopId = null;
		remark = null;
		oid = null;
		value = null;
		billId = null;
		change = null;
		sn = null;
		voucherTypeId = null;
	}


    @SerializedName("id")
    public Long id;    


    @SerializedName("voucher_id")
    public Long voucherId;    


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

    @SerializedName("change")
    public Double change = 0.0; 
    
    @SerializedName("staff_id")
    public Long staffId;

	@SerializedName("sn")
	public String sn;

	@SerializedName("voucher_type_id")
	public Long voucherTypeId;

	public boolean isTemp = false;

	public boolean isTemp() {
		return isTemp;
	}

	public void setTemp(boolean isTemp) {
		this.isTemp = isTemp;
	}

	public static PaymentVoucher fromJson(String json) {
		Gson gson = new GsonBuilder().serializeNulls().create();

		return gson.fromJson(json, PaymentVoucher.class);
	}

}
