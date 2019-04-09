package com.example.myapplication.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Activity.FilterActivity;
import com.example.myapplication.Adapter.HomeAdapter;
import com.example.myapplication.Adapter.SearchLocationAdapter;
import com.example.myapplication.BottomSheetsFragment.SearchLocationFragment;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class InternshipsFragment extends Fragment implements SearchLocationAdapter.SearchClick {

    @BindView(R.id.rv_search_location)
    RecyclerView rv_search_location;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_internships, container, false);
        ButterKnife.bind(this,view);
        setUpRecyclerView();
        return view;
    }

    private void setUpRecyclerView() {
        rv_search_location.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_search_location.setAdapter(new SearchLocationAdapter(getActivity(),InternshipsFragment.this));
    }

    @OnClick({R.id.cl_SearchClick,R.id.iv_filter})
    void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.cl_SearchClick:
                SearchLocationFragment location = new SearchLocationFragment();
                location.show(getFragmentManager(),"Location");
                break;

            case R.id.iv_filter:
                Intent myIntent = new Intent(getActivity(), FilterActivity.class);
                getActivity().startActivity(myIntent);
                break;
        }
    }

    @Override
    public void itemClick(int position) {
        getFragmentManager().beginTransaction().replace(R.id.fragment_container,new IntrnshipDetailFragment()).commit();
    }
}
