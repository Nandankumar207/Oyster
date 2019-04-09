package com.example.myapplication.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_filter_back, R.id.btn_submit})
    void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.iv_filter_back:
                onBackPressed();
                break;

            case R.id.btn_submit:
                finish();
                break;
        }
    }
}
