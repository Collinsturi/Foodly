package com.rsk.foodly

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import com.rsk.foodly.databinding.FragmentContactsBinding
import com.rsk.foodly.datastore.StoreUserData
import kotlinx.coroutines.launch
import java.lang.Integer.parseInt


class ContactsFragment : Fragment(R.layout.fragment_contacts) {
    private lateinit var binding: FragmentContactsBinding

    private lateinit var fragmentContext: Context

    private lateinit var dataStore: StoreUserData

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentContactsBinding.bind(view)

        fragmentContext = view.context

        dataStore = StoreUserData(fragmentContext)

        binding.imageViewMobileNumber.setOnClickListener{

        }

        var phoneNo = 0
        binding.imageViewMobileNumber.setOnClickListener{
            phoneNo = parseInt(binding.edtTxtphoneNumber.text.toString())
            lifecycleScope.launch {
                dataStore.saveUserMobileNumber(phoneNo)
            }

            Toast.makeText(fragmentContext, "phone number: $phoneNo", Toast.LENGTH_SHORT).show()

            view.findNavController().navigate(R.id.action_contactsFragment_to_emailAddressFragment)
        }
    }
}