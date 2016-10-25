package com.example.william.learnenglish.Niveles;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.william.learnenglish.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TercerNivel extends Fragment {


    public TercerNivel() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tercer_nivel, container, false);
    }

}
