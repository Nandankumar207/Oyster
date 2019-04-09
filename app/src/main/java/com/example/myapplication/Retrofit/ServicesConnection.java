package com.example.myapplication.Retrofit;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import com.example.myapplication.Activity.SplashActivity;
import com.example.myapplication.Model.CommonModel;
import com.example.myapplication.SharedPrefrence.SPreferenceKey;
import com.example.myapplication.SharedPrefrence.SharedPreferenceWriter;
import com.example.myapplication.Utility.CommonUtilities;
import com.example.myapplication.Utility.MyApplication;

import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicesConnection {
    // ServiceProgressDialog serviceProgressDialog;
    private static ServicesConnection connect;
    private ServicesInterface clientService;
    private ServicesInterface clientIpayAfrica;
   private static final String BASE_URL = "https://asecenglish.com/asecapi/api/";
   // private static final String BASE_URL = " http://mobuloustech.com/asecapi/api/";

    public static final int DEFAULT_RETRIES = 0;

    public static synchronized ServicesConnection getInstance() {
        if (connect == null) {
            connect = new ServicesConnection();
        }
        return connect;
    }

    //    service interface instance to call api
    public ServicesInterface createService() throws Exception {
        if (clientService == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();//    logs HTTP request and response data.
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);//  set your desired log level
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
//            httpClient.readTimeout(1, TimeUnit.SECONDS)
//                    .connectTimeout(1, TimeUnit.SECONDS);
            httpClient.readTimeout(1, TimeUnit.MINUTES);
            httpClient.readTimeout(1, TimeUnit.MINUTES);
            // add your other interceptors …
            httpClient.addInterceptor(logging); //  add logging as last interceptor

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();

            clientService = retrofit.create(ServicesInterface.class);
        }
        return clientService;
    }


    //    enqueue
    public <T> boolean enqueueWithRetry(Call<T> call, final Activity activity, boolean isLoader, final int retryCount, final Callback<T> callback) {
        if (MyApplication.networkConnectionCheck()) {
            if(isLoader)
            {
                if(activity!=null){


                }
                    CommonUtilities.showLoadingDialog(activity);


            }
            call.enqueue(new ServicesRetryableCallback<T>(call, retryCount)
            {
                @Override
                public void onFinalResponse(Call<T> call, Response<T> response)
                {
                    if(CommonUtilities.customProgressBar!=null)
                    {
                       CommonUtilities.dismissLoadingDialog();
                   }
                   if(response.body() instanceof CommonModel)
                    {

                        if(((CommonModel)response.body()).getMessage().equals("Login Token Expire"))
                        {

                            Intent intent= new Intent(activity, SplashActivity.class);
                            ((Activity)activity).startActivity(intent);
                            Toast.makeText(activity, "User already loged in", Toast.LENGTH_SHORT).show();
                            ((Activity) activity).finishAffinity();

                            SharedPreferenceWriter.getInstance(activity).writeStringValue(SPreferenceKey.ISLOGIN,"Logout");
                            SharedPreferenceWriter.getInstance(activity).writeStringValue(SPreferenceKey.DEVICETOKEN,"");
                            SharedPreferenceWriter.getInstance(activity).writeStringValue(SPreferenceKey.TOKEN,"");

                        }


                    }
                    callback.onResponse(call, response);
                }

                @Override
                public void onFinalFailure(Call<T> call, Throwable t)
                {
                    if(CommonUtilities.customProgressBar!=null)
                    {
                        CommonUtilities.dismissLoadingDialog();
                    }
                    if(t instanceof SocketTimeoutException)
                    {
                    }
                    callback.onFailure(call, t);
                }
            });
           return true;
        } else {

            // CustomToast.showCustomToast(activity, activity.getString(R.string.interdis));
            return false;
        }
    }

    public  <T> boolean enqueueWithoutRetry(Call<T> call, Activity activity, boolean isLoader, final Callback<T> callback) {
        return enqueueWithRetry(call,  activity,isLoader, DEFAULT_RETRIES, callback);
    }
}
