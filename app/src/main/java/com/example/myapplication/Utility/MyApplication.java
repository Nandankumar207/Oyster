package com.example.myapplication.Utility;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDelegate;
import android.view.inputmethod.InputMethodManager;


public class MyApplication extends Application {


    /********* How to make the perfect Singleton?: ***********/
//    Link:  https://medium.com/exploring-code/how-to-make-the-perfect-singleton-de6b951dfdb0

    private static volatile MyApplication myApplication = null;
    //    private final String TAG = MyApplication.class.getSimpleName();
    private static Context context = null;
    private NetworkConnectionCheck connectionCheck;
   // private OysterDataBase db=null;
    // This flag should be set to true to enable VectorDrawable support for API < 21
    static
    {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }


    public static boolean networkConnectionCheck()
    {
        if(myApplication.connectionCheck==null)
        {
            myApplication.connectionCheck=new NetworkConnectionCheck(myApplication);
        }
        return myApplication.connectionCheck.isConnect();
    }


    public static MyApplication getInstance() {

        if (myApplication == null) {     //Check for the first time

            synchronized (MyApplication.class) {    //Check for the second time.
                if (myApplication == null)  // if there is no instance available... create new one
                    myApplication = new MyApplication();
            }
        }

        return myApplication;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        myApplication = this;
        context = this.getApplicationContext();



        /*//FOR FULL IMAGE FILE SHARING */
//        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
//        StrictMode.setVmPolicy(builder.build());



    }

    //  METHOD: TO HIDE SOFT INPUT KEYBOARD
    public static void hideSoftKeyBoard(@NonNull Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (activity.getCurrentFocus() != null)
            if (imm != null) {
                imm.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }

    }


//    private void setToolbar(Activity activity){
//
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.back);
//
//        tvTitle.setText(ParamEnum.MyCourses.theValue());
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
//
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                activity.onBackPressed();
//            }
//        });
//
//
//    }



}
