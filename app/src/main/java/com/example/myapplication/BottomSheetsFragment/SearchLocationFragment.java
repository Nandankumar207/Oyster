package com.example.myapplication.BottomSheetsFragment;


import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Activity.HomeActivity;
import com.example.myapplication.Fragment.InternshipsFragment;
import com.example.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


    public class SearchLocationFragment extends BottomSheetDialogFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search_location, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick({R.id.btn_search, R.id.iv_close})
    void onClick(View view )
    {
        switch (view.getId())
        {
            case R.id.btn_search:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,new InternshipsFragment()).commit();
                dismiss();
                break;

            case R.id.iv_close:
                dismiss();
                break;
        }
    }

}
