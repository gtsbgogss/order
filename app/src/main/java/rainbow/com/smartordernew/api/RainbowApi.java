package rainbow.com.smartordernew.api;

import rainbow.com.smartordernew.Status;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ss on 16/4/13.
 */
public interface RainbowApi {

    @GET("health")
    Call<Status> CheckAgent();
}
