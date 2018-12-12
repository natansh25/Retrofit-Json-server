package infinity1087.android.com.retrofitpostexample.RetrofitService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    // for running in emulator use 10.0.2.2:3000 not localhost

    public static String Base_URL = " http://10.0.2.2:3000";


    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null)

        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }
        return retrofit;
    }
}