package com.example.material_design_hw

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class NewFragment : Fragment(R.layout.new_fragment){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_gallery).setOnClickListener {
            findNavController().navigate(R.id.action_newFragment_to_nav_gallery)
        }
    }
}