package com.rsk.foodly.getStarted

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.rsk.foodly.R
import com.rsk.foodly.databinding.FragmentEmailAddressBinding
import com.rsk.foodly.viewmodel.GetStartedViewModel
import com.rsk.foodly.viewmodel.GetStartedViewModelFactory

class EmailAddressFragment : Fragment(R.layout.fragment_email_address) {

    private lateinit var binding: FragmentEmailAddressBinding
    private lateinit var fragContext: Context
    private val getStartedViewModel by activityViewModels<GetStartedViewModel> {
        GetStartedViewModelFactory(fragContext)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentEmailAddressBinding.bind(view)

        fragContext = view.context

        binding.ImageViewContinueEmailAddress.setOnClickListener{
            val emailaddress = binding.editTextEmailAddress.text.toString()
            getStartedViewModel.saveEmailAddress(emailaddress)

            view.findNavController().navigate(R.id.action_emailAddressFragment_to_accountPasswordFragment)

        }

    }
}