package infinity1087.android.com.retrofitpostexample.RetrofitService;


import java.util.Calendar;
import java.util.List;

import infinity1087.android.com.retrofitpostexample.model.Employe;
import infinity1087.android.com.retrofitpostexample.model.EmployeResult;
import infinity1087.android.com.retrofitpostexample.model.Example;
import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    // return an array list List<Example>
    @GET("employees")
    Call<List<Example>> getEmployees();

    // returns an object so <Example>
    @GET("employees/{user_id}")
    Call<Example> getEmployeesByID(@Path("user_id") int path);

    @POST("employees")
    @FormUrlEncoded
    Call<Example> savePost(@Field("first_name") String fname,
                        @Field("last_name") String lname,
                        @Field("email") String email);


}
