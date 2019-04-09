package com.example.myapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.HomeAdapter;
import com.example.myapplication.Adapter.NotificationAdapter;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    @BindView(R.id.rv_notification)
    RecyclerView rv_notification;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notification, container, false);
        ButterKnife.bind(this,view);
        setupRecyclerview();
        return view;
    }

    private void setupRecyclerview() {
        rv_notification.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_notification.setAdapter(new NotificationAdapter(getActivity()));
    }

}
