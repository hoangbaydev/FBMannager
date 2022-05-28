package com.example.fbmanage.Framment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fbmanage.R;

public class Trogiup_Fragment extends Fragment {
    private View mView;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate( R.layout.fragment_trogiup_, container, false );


        return mView;
    }
}
