package com.daslab.das.rider.Model;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daslab.das.rider.R;

/**
 * Created by User on 12/15/2017.
 */

public class BottomSheetRiderFragment extends BottomSheetDialogFragment {

    String mTag;
    public static BottomSheetRiderFragment newInstance(String tag)
    {
        BottomSheetRiderFragment f= new BottomSheetRiderFragment();
        Bundle args = new Bundle();
        args.putString("Tag",tag);
        f.setArguments(args);
        return f;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTag = getArguments().getString("TAG");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.bottom_sheet_rider,container,false);
        //TextView
        return view;
    }
}
