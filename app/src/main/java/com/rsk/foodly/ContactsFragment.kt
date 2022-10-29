package com.rsk.foodly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController


class ContactsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)

        val btnContactsNextFrag: ImageView = view.findViewById(R.id.imageViewMobileNumber)
        btnContactsNextFrag.setOnClickListener{
            view.findNavController().navigate(R.id.action_contactsFragment_to_emailAddressFragment)
        }
        return view
    }
}