package rainbow.com.smartordernew.presenter;

import android.app.Activity;

import rainbow.com.smartordernew.common.mvp.BasePresenter;
import rainbow.com.smartordernew.common.mvp.BaseView;

/**
 * Created by ss on 16/4/22.
 */

public class MainPresenter extends BasePresenter<BaseView>{

    public MainPresenter(Activity context, BaseView view) {
        super(context, view);
    }
}
