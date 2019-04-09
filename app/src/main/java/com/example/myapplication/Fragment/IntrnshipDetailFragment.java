package com.example.myapplication.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntrnshipDetailFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_intrnship_detail, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

}
