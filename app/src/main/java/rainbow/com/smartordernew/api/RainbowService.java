package rainbow.com.smartordernew.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ss on 16/4/13.
 */
public class RainbowService {

    public static final String BASE_URL = "http://demo1.sanyipos.com:9090/smartpos/";
    private static Retrofit singleton;

    public RainbowService() {
    }

    private static Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static RainbowApi createRainbowService(){
        return mRetrofit.create(RainbowApi.class);
    }
}
