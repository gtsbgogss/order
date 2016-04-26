package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class DisplayItems {

    public static class HandoverInformationList {


        //收银
        @SerializedName("detail")
        public List<DisplayAmountItem> handoverInfos = new ArrayList<DisplayAmountItem>();
        //减免
        @SerializedName("waive")
        public List<DisplayAmountItem> waiveInfos = new ArrayList<DisplayAmountItem>();

        @SerializedName("sale")
        public List<DisplayAmountItem> saleInfos = new ArrayList<>();

        @SerializedName("member")
        public List<DisplayAmountItem> memberInfos = new ArrayList<>();

        @SerializedName("summary")
        public List<DisplaySummaryItem> handoverSummarys = new ArrayList<DisplaySummaryItem>();

        @SerializedName("reminder")
        public String reminder;
    }

    public static class DisplayAmountItem {

        @SerializedName("item")
        public String description;

        @SerializedName("amount")
        public Double amount = 0.0;

        @SerializedName("count")
        public Double count;

        @SerializedName("subdetail")
        public List<DisplayAmountItem> subdetail;
    }

    public static class DisplayAmountItemDetail {

        @SerializedName("item")
        public String description;

        @SerializedName("amount")
        public Double amount = 0.0;

        @SerializedName("count")
        public Integer count;
    }

    public static class DisplaySummaryItem {
        @SerializedName("item")
        public String description;

        @SerializedName("value")
        public String value;
    }
}
