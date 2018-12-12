package infinity1087.android.com.retrofitpostexample.RetrofitService;


import java.util.Calendar;

import infinity1087.android.com.retrofitpostexample.model.Employe;
import infinity1087.android.com.retrofitpostexample.model.EmployeResult;
import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("employees")
    Call<EmployeResult> getEmployees();

    @GET("employees/{user_id}")
    Call<EmployeResult> getEmployeesByID(@Path("user_id") int path);


}
