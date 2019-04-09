package com.example.myapplication.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Adapter.WallOfFameAdapter;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WalloffameActivity extends AppCompatActivity {

    @BindView(R.id.rv_wall_of_fame)
    RecyclerView rv_wall_of_fame;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_of_fame);
        ButterKnife.bind(this);
        setUpRecyclerview();
    }

    private void setUpRecyclerview() {
        rv_wall_of_fame.setLayoutManager(new LinearLayoutManager(this));
        rv_wall_of_fame.setAdapter(new WallOfFameAdapter(WalloffameActivity.this));
    }

}
