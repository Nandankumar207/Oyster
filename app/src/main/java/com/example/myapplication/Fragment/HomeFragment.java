package com.example.myapplication.Fragment;


import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Activity.HomeActivity;
import com.example.myapplication.Adapter.HomeAdapter;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeAdapter.RcItemClick {

    @BindView(R.id.rv_home)
    RecyclerView rv_home;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this,view);
        setRecylerView();
        return view;

    }

    private void setRecylerView() {
      rv_home.setLayoutManager(new LinearLayoutManager(getActivity()));
      rv_home.setAdapter(new HomeAdapter(getActivity(), HomeFragment.this));
    }


    @Override
    public void itemClickListener(int position) {
        getFragmentManager().beginTransaction().replace(R.id.fragment_container,new InterDashboardFragment(),null).commit();
    }
}
