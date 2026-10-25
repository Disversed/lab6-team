package com.lab6.mikhail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lab6.R;

public class FirstAttractionFragment extends Fragment {

    public FirstAttractionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.imageViewAttraction);
        TextView title = view.findViewById(R.id.textViewTitle);
        TextView desc = view.findViewById(R.id.textViewDescription);

        title.setText(R.string.ermitage);
        desc.setText(R.string.ermitage_description);
        imageView.setImageResource(R.drawable.ermitage);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attraction, container, false);
    }
}