package com.example.myapplication.BottomSheetsFragment;


import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class SubmitOtpFragment extends BottomSheetDialogFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_submit_otp, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.btn_submit_otp)
    void onclick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_submit_otp:
                ResetPassFragment resetPassFragment = new ResetPassFragment();
                resetPassFragment.show(getFragmentManager(),"ResetPass");
                break;
        }
    }

}
