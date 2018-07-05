package com.example.rahulyiet.fragmentassignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class FragementTwo extends Fragment {

    ImageView output;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragementtwo,container,false);
        output=v.findViewById(R.id.fragement2);
        output.setImageResource(R.drawable.virat);

        return  v;
    }
}
