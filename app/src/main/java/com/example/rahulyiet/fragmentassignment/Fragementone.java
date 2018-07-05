package com.example.rahulyiet.fragmentassignment;

import android.icu.util.Output;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragementone extends Fragment {
    TextView output;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragementone, container, false);

        output = v.findViewById(R.id.fragement1);


           output.setText("Fragement1");







       return v;

    }
}
