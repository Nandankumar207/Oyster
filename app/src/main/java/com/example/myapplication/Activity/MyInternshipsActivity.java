package com.example.myapplication.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.Fragment.NotificationFragment;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyInternshipsActivity extends AppCompatActivity {

    @BindView(R.id.iv_notification)
    ImageView iv_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_internships);
        ButterKnife.bind(this);
        iv_notification.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.iv_notification)
    void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.iv_notification:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new NotificationFragment(),null).commit();
                break;
        }
    }
}
