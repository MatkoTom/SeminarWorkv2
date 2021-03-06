package hr.tomljanovic.matko.seminarskirad.network.retrofit;

import hr.tomljanovic.matko.seminarskirad.utils.Const;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAdapter {
    public static final String URL = Const.Network.BASE_URL;

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static HackerNewsAPI requestApi = retrofit.create(HackerNewsAPI.class);

    public static HackerNewsAPI getRequestApi() {
        return requestApi;
    }
}
