package rainbow.com.smartordernew;

/**
 * Created by ss on 16/4/13.
 */
public class Status {
    @Override
    public String toString() {
        return "Status{" +
                "health=" + status +
                '}';
    }

    //    {
//        "status": {
//        "code": 0,
//                "message": "服务器正常"
//    }
//    }
    public Health status;
    public class Health {
        @Override
        public String toString() {
            return "Health{" +
                    "code=" + code +
                    ", message='" + message + '\'' +
                    '}';
        }

        public Integer code;

        public String message;
    }
}
