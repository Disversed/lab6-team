package com.lab6.mikhail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

        requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                menuInflater.inflate(R.menu.menu_toolbar_mikhail, menu);
            }

            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                NavController navController = Navigation.findNavController(requireView());
                if (id == R.id.firstAttractionFragment) {
                    navController.navigate(R.id.firstAttractionFragment);
                    return true;
                }
                else if (id == R.id.secondAttractionFragment) {
                    navController.navigate(R.id.secondAttractionFragment);
                    return true;
                }
                else if (id == R.id.thirdAttractionFragment) {
                    navController.navigate(R.id.thirdAttractionFragment);
                    return true;
                }
                return false;
            }
        }, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attraction, container, false);
    }
}
