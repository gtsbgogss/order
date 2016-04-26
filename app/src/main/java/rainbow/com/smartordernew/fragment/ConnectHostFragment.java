package rainbow.com.smartordernew.fragment;

import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import butterknife.Bind;
import rainbow.com.smartordernew.R;
import rainbow.com.smartordernew.common.ui.fragment.BaseLazyFragment;
import rainbow.com.smartordernew.common.util.eventbus.EventCenter;

/**
 * Created by ss on 16/4/22.
 */
public class ConnectHostFragment extends BaseLazyFragment implements View.OnClickListener{

    @Bind(R.id.editText_connect_host)
     TextInputEditText mEditText;

    @Bind(R.id.button_connect_host)
     AppCompatButton mButton;

    @Override
    protected void initViewsAndEvents() {
        mButton.setOnClickListener(this);

    }




    @Override
    protected int getContentViewLayoutID() {
        return R.layout.layout_fragment_connect_host;
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_connect_host:
                break;
        }
    }

}
