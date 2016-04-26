package rainbow.com.smartordernew;

import android.app.Application;

import com.socks.library.KLog;
import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by ss on 16/4/13.
 */
public class RainbowApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        KLog.init(Config.LOG_DEBUG);
        AutoLayoutConifg.getInstance().useDeviceSize();

    }
}
