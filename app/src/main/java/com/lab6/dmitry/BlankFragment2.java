package com.lab6.dmitry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lab6.R;

// ЭТО КЛАСС ДМИТРИЯ. ЕСЛИ ТЫ НЕ ДМИТРИЙ - ИДИ ОТСЮДА ПО-ХОРОШЕМУ.
public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}