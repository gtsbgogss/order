package sanyipos.sdk.model.socket;

/**
 * Created by ss on 2016/3/11.
 */
public class PrintMessage {

    public String action;

    public String tag;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public PrintResult message;

    public PrintResult getMessage() {
        return message;
    }

    public void setMessage(PrintResult message) {
        this.message = message;
    }

    public static class PrintResult {
        public static int FAILED = 0;
        public static int SUCCESSED = 1;

        public Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int state;
    }
}
