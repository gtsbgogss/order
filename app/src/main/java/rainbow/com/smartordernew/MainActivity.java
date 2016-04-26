package rainbow.com.smartordernew;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import rainbow.com.smartordernew.common.ui.activity.BaseAppCompatActivity;
import rainbow.com.smartordernew.common.util.eventbus.EventCenter;
import rainbow.com.smartordernew.common.util.netstatus.NetUtils;
import rainbow.com.smartordernew.fragment.ConnectHostFragment;

public class MainActivity extends BaseAppCompatActivity {


    public ConnectHostFragment mConnectHostFragment;
    public static final int FRAMELAYOUT = R.id.frameLayout_main;

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewsAndEvents() {
        disPalyFragment(Constants.CONNECT_HOST_FRAGMENT);

    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    private void disPalyFragment(int type) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        hideFragment(ft);
        switch (type) {
            case Constants.CONNECT_HOST_FRAGMENT:
                if (mConnectHostFragment == null) {
                    mConnectHostFragment = new ConnectHostFragment();
                    ft.add(FRAMELAYOUT, mConnectHostFragment);
                }
                ft.show(mConnectHostFragment);
                break;
        }
        ft.commit();

    }

    private void hideFragment(FragmentTransaction ft) {

        if (mConnectHostFragment != null) {
            ft.hide(mConnectHostFragment);
        }

    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
