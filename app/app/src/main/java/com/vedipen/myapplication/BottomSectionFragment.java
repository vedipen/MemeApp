package com.vedipen.myapplication;

/**
 * Created by vedipen on 23/3/17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment {

    private static TextView txtTop;
    private static TextView txtBottom;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        txtTop = (TextView)view.findViewById(R.id.topMemeText);
        txtBottom = (TextView)view.findViewById(R.id.bottomMemeText);
        return view;
    }

    public void setClickedText(String top, String bottom){
        txtTop.setText(top);
        txtBottom.setText(bottom);
    }

}