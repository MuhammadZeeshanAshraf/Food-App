package com.sometning.zeesh.dashboard.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sometning.zeesh.dashboard.R;
import com.sometning.zeesh.dashboard.SettingActivity;


public class FiveFragment extends Fragment {

    CardView cardView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_five, container, false);
        cardView = view.findViewById(R.id.cv_five_setting);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , SettingActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }



}
