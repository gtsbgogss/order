package rainbow.com.smartordernew.common.mvp;

import android.app.Activity;

import rainbow.com.smartordernew.api.RainbowApi;
import rainbow.com.smartordernew.api.RainbowService;

/**
 * Created by ss on 16/4/22.
 */
public class BasePresenter<GV extends BaseView> {

    protected  GV mView;

    protected Activity mContext;

    public static final RainbowApi fApi = RainbowService.createRainbowService();

    public BasePresenter(Activity context,GV view){
        mContext = context;
        mView = view;
    }
}
