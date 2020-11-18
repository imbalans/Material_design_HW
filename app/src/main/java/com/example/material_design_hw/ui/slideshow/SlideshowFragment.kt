package com.example.material_design_hw.ui.slideshow

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.material_design_hw.R

class SlideshowFragment : Fragment(R.layout.fragment_slideshow) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_newfragment).setOnClickListener {
            findNavController().navigate(R.id.action_nav_slideshow_to_newFragment)
        }
    }
}