package infinity1087.android.com.retrofitpostexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import infinity1087.android.com.retrofitpostexample.RetrofitService.ApiClient;
import infinity1087.android.com.retrofitpostexample.RetrofitService.ApiInterface;
import infinity1087.android.com.retrofitpostexample.model.Employe;
import infinity1087.android.com.retrofitpostexample.model.EmployeResult;
import infinity1087.android.com.retrofitpostexample.model.Example;
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



    }

    public void get(View view) {

        //------------------for get

      /*  ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<List<Example>> call = apiInterface.getEmployees();
        call.enqueue(new Callback<List<Example>>() {
            @Override
            public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {

                String url = String.valueOf(response.raw().request().url());
                Log.d("xxx", url);
                //List<EmployeResult> results = response.body().getEmployees();


            }

            @Override
            public void onFailure(Call<List<Example>> call, Throwable t) {
                Log.d("xxx", t.getMessage());
            }
        });*/

   //----------------- get by id
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<Example> call = apiInterface.getEmployeesByID(3);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                String url = String.valueOf(response.raw().request().url());
                Log.d("xxx", url);
                //List<EmployeResult> results = response.body().getEmployees();


            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("xxx", t.getMessage());
            }
        });

    }

    public void post(View view) {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        apiInterface.savePost("Alvato", "Plve", "giut@uic.xom").enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                if(response.isSuccessful()) {
                   // showResponse(response.body().toString());
                    Log.i("hhh", "post submitted to API." + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("hhh", "Unable to submit post to API." + t.getMessage());
            }
        });
    }

    public void put(View view) {
    }

    public void delet(View view) {






    }
}
