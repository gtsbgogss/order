package sanyipos.sdk.model.scala;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class ClosedBill {
    @SerializedName("id")
    public Long id;

    @SerializedName("sn")
    public String sn;

    @SerializedName("staff")
    public Long staffId;

    @SerializedName("staffName")
    public String staffName;

    @SerializedName("cashierStaff")
    public Long cashierStaffId;

    @SerializedName("cashierStaffName")
    public String cashierStaffName;

    @SerializedName("amount")
    public Double amount;

    @SerializedName("payInfo")
    public String payInfo;

    @SerializedName("state")
    public Integer state;

    @SerializedName("closedTime")
    public Date closedTime;

    @SerializedName("orders")
    public List<BillOrder> orders;

    public static class BillOrder {
        @SerializedName("id")
        public Long id;

        @SerializedName("sn")
        public String sn;

        @SerializedName("table")
        public Long tableId;

        @SerializedName("seat")
        public Long tableSeatId;

        @SerializedName("tableName")
        public String tableName;

        @SerializedName("personCount")
        public Integer personCount;

        @SerializedName("tag")
        public String tag;
    }
}

