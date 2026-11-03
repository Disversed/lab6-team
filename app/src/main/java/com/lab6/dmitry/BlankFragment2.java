package com.lab6.dmitry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lab6.R;

// ЭТО КЛАСС ДМИТРИЯ. ЕСЛИ ТЫ НЕ ДМИТРИЙ - ИДИ ОТСЮДА ПО-ХОРОШЕМУ.
public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        Button toSecondBtn = view.findViewById(R.id.buttonDmitryToSecondFragment);
        toSecondBtn.setOnClickListener(v -> {
            Navigation.findNavController(view)
                    .navigate(R.id.action_blankFragment2_to_powerFragment);
        });

        return view;
    }
}