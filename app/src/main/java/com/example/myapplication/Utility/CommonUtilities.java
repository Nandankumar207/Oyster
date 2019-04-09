package com.example.myapplication.Utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.Calendar;


/**
 * Created by Mahipal Singh on 26,June,2018
 * mahisingh1@outlook.com
 */
public class CommonUtilities {
    public static String path;
    public static CustomProgressBar customProgressBar;

    public static Uri fileUri;

    /* public static boolean isNetworkAvailable(Context context) {

         try {

             ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
             NetworkInfo mobile_info = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
             NetworkInfo wifi_info = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
             if (mobile_info != null) {
                 if (mobile_info.isConnectedOrConnecting()
                         || wifi_info.isConnectedOrConnecting()) {
                     return true;
                 } else {
                     return false;
                 }
             } else {
                 if (wifi_info.isConnectedOrConnecting()) {
                     return true;
                 } else {
                     return false;
                 }
             }

         } catch (Exception e) {
             // TODO: handle exception
             e.printStackTrace();
             System.out.println("" + e);
             return false;
         }
     }
 */
    public static void showDialog(Activity activity, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Alert!");
        builder.setCancelable(false);
        builder.setMessage(message);
        builder.setPositiveButton("Ok", null);
        ;
        builder.show();
    }

    public static void showLoadingDialog(Activity activity) {
        if (customProgressBar == null)
            customProgressBar = CustomProgressBar.show(activity, true, true);

        try {
            customProgressBar.setCancelable(false);
            customProgressBar.show();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void dismissLoadingDialog() {
        try {
            if (null != customProgressBar && customProgressBar.isShowing()) {
                customProgressBar.dismiss();
                customProgressBar = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hideSoftKeyboard(Activity activity) {
        try {

            InputMethodManager inputMethodManager = (InputMethodManager) activity.
                    getSystemService(Activity.INPUT_METHOD_SERVICE);
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    public static String getAge(int year, int month, int day) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.set(day, month, year);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        Integer ageInt = new Integer(age);
        String ageS = ageInt.toString();

        return ageS;
    }


    public static void snackBar(Activity activity, String message) {
        Snackbar snackbar = Snackbar.make(activity.findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setMinimumHeight(20);
        snackBarView.setBackgroundColor(Color.parseColor("#00ABE1"));
        TextView tv = (TextView) snackBarView.findViewById(android.support.design.R.id.snackbar_text);
        tv.setTextSize(13);
        //Fonts.OpenSans_Regular_Txt(tv, activity.getAssets());
        tv.setTextColor(Color.parseColor("#ffffff"));
        snackbar.show();
    }

//    ///////////for adjusting bottom menu icon ////////////////
//    @SuppressLint("RestrictedApi")
//    public static void disableShiftMode(BottomNavigationView view) {
//        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
//        try {
//            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
//            shiftingMode.setAccessible(true);
//            shiftingMode.setBoolean(menuView, false);
//            shiftingMode.setAccessible(false);
//
//            for (int i = 0; i < menuView.getChildCount(); i++) {
//                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
//                //noinspection RestrictedApi
//                item.setShiftingMode(false);
//                // set once again checked value, so view will be updated
//                //noinspection RestrictedApi
//                item.setChecked(item.getItemData().isChecked());
//            }
//
//        } catch (NoSuchFieldException e) {
//
//            Log.e("BNVHelper", "Unable to get shift mode field", e);
//
//        } catch (IllegalAccessException e) {
//
//            Log.e("BNVHelper", "Unable to change value of shift mode", e);
//
//        }
//    }


    //    METHOD: TO DRAW UNDERLINE BELOW TEXT_VIEW AND MAKE TEXT AND LINE IN BLUE COLOR
    public static void setUpBlueTextWithUnderLine(TextView textView, int start, int end, String str) {

        SpannableString content = new SpannableString(str);

        content.setSpan(new ForegroundColorSpan(Color.parseColor("#00ABE1")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

//        content.setSpan(new StyleSpan(Typeface.ITALIC), start, end, 0);

        textView.setText(content);
    }


    public static boolean isNetworkAvailable(Context context) {

        try {

            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mobile_info = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            NetworkInfo wifi_info = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (mobile_info != null) {
                if (mobile_info.isConnectedOrConnecting()
                        || wifi_info.isConnectedOrConnecting()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (wifi_info.isConnectedOrConnecting()) {
                    return true;
                } else {
                    return false;
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("" + e);
            return false;
        }
    }

    ///////email check string///////////

    public static String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    public static void setToolbar(final AppCompatActivity activity, android.support.v7.widget.Toolbar toolbar, TextView title, String TitleContent) {

        activity.setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_launcher_background);

        title.setText(TitleContent);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onBackPressed();
            }
        });

    }

    public static void getDeviceToken(Context context) {

        final Thread thread = new Thread() {
            @Override
            public void run() {
                Log.e(">>>>>>>>>>>>>>", "thred IS  running");
                try {

                    // SharedPreferenceWriter.getInstance(context).writeStringValue(SPreferenceKey.DEVICETOKEN,"");

                   /* if (SharedPreferenceWriter.getInstance(context).getString(SPreferenceKey.DEVICETOKEN).isEmpty()) {
                        String token = FirebaseInstanceId.getInstance().getToken();
//                        String token = Settings.Secure.getString(getApplicationContext().getContentResolver(),
//                                Settings.Secure.ANDROID_ID);
                        Log.e("Generated Device Token", "-->" + token);

                        if (token == null) {
                            getDeviceToken(context);
                        } else {

                            SharedPreferenceWriter.getInstance(context).writeStringValue(SPreferenceKey.DEVICETOKEN,token);
                            //mPreference.writeStringValue(SharedPreferenceKey.DEVICE_TOKEN, token);
                        }
                    }*/
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                super.run();
            }
        };
        thread.start();

    }

}
