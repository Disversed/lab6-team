package com.lab6.denis

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.lab6.R

class BiographyFragment : Fragment(R.layout.fragment_biography){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNext = view.findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_biographyFragnebt_to_worksFragment)
        }

    }
}