package com.example.fragmenthandling.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenthandling.R

class fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fragment2, container, false)

        val displayMsg = arguments?.getString("AtoB")

        val textRecieve = view.findViewById<TextView>(R.id.txtRecieve)

        textRecieve.setText(displayMsg)

        return view
    }

}