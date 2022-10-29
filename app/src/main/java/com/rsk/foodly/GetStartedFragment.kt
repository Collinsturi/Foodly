package com.rsk.foodly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class GetStartedFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_get_started, container, false)

        val btnGetStartedNextFrag: Button = view.findViewById(R.id.btnGetStarted)
        btnGetStartedNextFrag.setOnClickListener{
            view.findNavController().navigate(R.id.action_getStartedFragment_to_contactsFragment)
        }

        return view
    }
}