package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.example.myapplication.BottomSheetsFragment.OTPFragment;
import com.example.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        fullScreen();
        hideKeyboard();

    }

    private void fullScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
    }

    @OnClick({R.id.btn_submit, R.id.tv_forgot})
    public void onclick(View view) {
        switch (view.getId()) {

            case R.id.btn_submit:
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
                break;
            case R.id.tv_forgot:
                OTPFragment otpFragment = new OTPFragment();
                otpFragment.show(getSupportFragmentManager(),"Otp");
                break;
        }
    }

    private void hideKeyboard() {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

}
