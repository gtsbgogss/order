package sanyipos.sdk.model.rest;

public class Config {
    public String mode;
    public String webUrl;
    public String apiUrl;
    public boolean autoGotoCooking = false;
    public String refreshType;


    public boolean isForceRFID = false;
    public boolean isMemberUsePassword = false;
    public boolean isWebSocket = true;

    /**
     * all 、 mobile 、  rfid 、  card  、 sn
     */

    public String memberQueryBy = "all";

    public void initConfig() {
        if (memberQueryBy.equals("rfid")) {
            isForceRFID = true;
        } else {
            isForceRFID = false;
        }
    }
}
