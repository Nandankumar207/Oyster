package com.example.myapplication.BottomSheetsFragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Activity.HomeActivity;
import com.example.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResetPassFragment extends BottomSheetDialogFragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reset_pass, container, false);
        ButterKnife.bind(this,view);
        return view;
    }
    @OnClick(R.id.btn_submit_otp)
    void onclick(View view)
    {
      switch (view.getId())
      {
          case R.id.btn_submit_otp:
              startActivity(new Intent(getActivity(), HomeActivity.class));
              getActivity().finish();
              break;
      }
    }
}
