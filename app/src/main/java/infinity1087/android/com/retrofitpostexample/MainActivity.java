package infinity1087.android.com.retrofitpostexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import infinity1087.android.com.retrofitpostexample.RetrofitService.ApiClient;
import infinity1087.android.com.retrofitpostexample.RetrofitService.ApiInterface;
import infinity1087.android.com.retrofitpostexample.model.Employe;
import infinity1087.android.com.retrofitpostexample.model.EmployeResult;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callRetrofit();
    }

    private void callRetrofit() {


        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<EmployeResult> call = apiInterface.getEmployees();
        call.enqueue(new Callback<EmployeResult>() {
            @Override
            public void onResponse(Call<EmployeResult> call, Response<EmployeResult> response) {
                String url = String.valueOf(response.raw().request().url());
                Log.d("xxx", url);
                //List<EmployeResult> results = response.body().getEmployees();


            }

            @Override
            public void onFailure(Call<EmployeResult> call, Throwable t) {
                Log.d("xxx", t.getMessage());
            }
        });

    }
}
