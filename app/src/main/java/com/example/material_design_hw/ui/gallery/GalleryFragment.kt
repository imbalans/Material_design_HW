package com.example.material_design_hw.ui.gallery

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.material_design_hw.R

class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_home).setOnClickListener{
            findNavController().navigate(R.id.action_nav_gallery_to_nav_home)
        }
    }
}