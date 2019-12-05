package com.example.fragment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {


    public SumFragment() {
        // Required empty public constructor
    }
    private Button btnCalculate;
    private EditText etRadius;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sum, container, false);
    }

}
