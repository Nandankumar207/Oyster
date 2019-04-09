package com.example.myapplication.BottomSheetsFragment;


import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class OTPFragment extends BottomSheetDialogFragment {

    @BindView(R.id.et_email_phone)
    EditText et_email_phone;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ot, container, false);
        ButterKnife.bind(this,view);
        return view;
    }


    @OnClick(R.id.btn_genereate_otp)
    void onclick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_genereate_otp:
                SubmitOtpFragment submitOtpFragment = new SubmitOtpFragment();
                submitOtpFragment.show(getFragmentManager(),"SubmitOTp");
                break;
        }
    }

}
