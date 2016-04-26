package sanyipos.sdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2016/2/18.
 */
public class TestPrintResult {

    @SerializedName("failed")
    public List<FailedPrint> failed = new ArrayList<>();

    public static class FailedPrint {

        @SerializedName("printer")
        public Long printerId;

        @SerializedName("exception")
        public PrintException exception;
    }

    public static class PrintException {

        @SerializedName("error_code")
        public Integer errorCode;

        @SerializedName("message")
        public String message;

        @SerializedName("extra_message")
        public String extraMessage;

    }
}
