package infinity1087.android.com.retrofitpostexample.RetrofitService;


import java.util.Calendar;
import java.util.List;

import infinity1087.android.com.retrofitpostexample.model.Employe;
import infinity1087.android.com.retrofitpostexample.model.EmployeResult;
import infinity1087.android.com.retrofitpostexample.model.Example;
import retrofit2.Call;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("employees")
    Call<List<Example>> getEmployees();

    @GET("employees/{user_id}")
    Call<List<Example>> getEmployeesByID(@Path("user_id") int path);


}
