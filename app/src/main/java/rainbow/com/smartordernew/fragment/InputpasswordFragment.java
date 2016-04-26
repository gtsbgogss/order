package rainbow.com.smartordernew.fragment;

import android.view.View;

import rainbow.com.smartordernew.R;
import rainbow.com.smartordernew.common.ui.fragment.BaseLazyFragment;
import rainbow.com.smartordernew.common.util.eventbus.EventCenter;

/**
 * Created by ss on 16/4/26.
 */
public class InputpasswordFragment extends BaseLazyFragment {


    @Override
    protected void initViewsAndEvents() {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.layout_fragment_input_password_radiobutton;
    }

    @Override
    protected void onFirstUserVisible() {

    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }
}
