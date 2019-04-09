package com.example.myapplication.Activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Fragment.CurrentlyWorkingFragment;
import com.example.myapplication.Fragment.NotificationFragment;
import com.example.myapplication.BottomSheetsFragment.SearchLocationFragment;
import com.example.myapplication.Fragment.ProfileFragment;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @BindView(R.id.drawerlayout)
    DrawerLayout drawerLayout;
    ActionBar actionbar;

    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @BindView(R.id.iv_notification)
    ImageView iv_notification;

    @BindView(R.id.iv_logo_of_selected_item)
    ImageView iv_logo_of_selected_item;

    @BindView(R.id.iv_logo)
    ImageView iv_logo;

    @BindView(R.id.tv_notification)
    TextView tv_notification;

    @BindView(R.id.commonToolbar)
    Toolbar commonToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        iv_notification.setVisibility(View.VISIBLE);
        iv_logo.setVisibility(View.VISIBLE);
        tv_notification.setVisibility(View.GONE);
        iv_logo_of_selected_item.setVisibility(View.GONE);
        setSupportActionBar(commonToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true); //hiding actionbar icon
        actionbar.setHomeAsUpIndicator(R.drawable.menu_icon_);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new CurrentlyWorkingFragment(), null).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.tv_project_internship,R.id.tv_myInternships,R.id.iv_notification})
    void onClick(View view)
    {
        Fragment fragment = null;
        switch (view.getId())
        {

            case R.id.tv_project_internship:
                /*fragment =new  HomeFragment();
                iv_notification.setVisibility(View.VISIBLE);
                iv_logo_of_selected_item.setVisibility(View.GONE);
                iv_logo.setVisibility(View.VISIBLE);
                tv_notification.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment, null).commit();*/
                SearchLocationFragment location = new SearchLocationFragment();
                location.show(getSupportFragmentManager(),"Location");
                drawerLayout.closeDrawers();
                break;

            case R.id.iv_notification:
                iv_notification.setVisibility(View.GONE);
                iv_logo.setVisibility(View.GONE);
                tv_notification.setVisibility(View.VISIBLE);
                iv_logo_of_selected_item.setVisibility(View.VISIBLE);
               // fragment = new NotificationFragment();
                /*fragment = new ProfileFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment,null).commit();*/
                startActivity(new Intent(HomeActivity.this,WalloffameActivity.class));
                break;
        }
    }
    public void toolChange()
    {
        iv_notification.setVisibility(View.GONE);
        iv_logo.setVisibility(View.GONE);
        tv_notification.setVisibility(View.VISIBLE);
        iv_logo_of_selected_item.setVisibility(View.VISIBLE);
    }

}
