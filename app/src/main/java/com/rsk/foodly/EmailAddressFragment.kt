package com.rsk.foodly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController

class EmailAddressFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_email_address, container, false)

        val btnEmailAddressNextFrag = view.findViewById<ImageView>(R.id.ImageViewContinueEmailAddress)
        btnEmailAddressNextFrag.setOnClickListener{
            view.findNavController().navigate(R.id.action_emailAddressFragment_to_accountPasswordFragment)
        }
        return view
    }
}