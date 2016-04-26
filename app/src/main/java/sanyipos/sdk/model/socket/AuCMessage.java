package sanyipos.sdk.model.socket;

/**
 * Created by ss on 2016/3/8.
 */
public class AuCMessage {
    public String action;

    public String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Message message;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public static class Message {
        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public int getVerSionType() {
            return versionType;
        }

        public void setVerSionType(int verSionType) {
            this.versionType = verSionType;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String pos;

        public String version;

        public int versionType;

        public String ip;


    }
}
