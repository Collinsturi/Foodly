package com.rsk.foodly.getStarted

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.rsk.foodly.R
import com.rsk.foodly.databinding.FragmentAccountPasswordBinding
import com.rsk.foodly.viewmodel.GetStartedViewModel
import com.rsk.foodly.viewmodel.GetStartedViewModelFactory

class AccountPasswordFragment : Fragment(R.layout.fragment_account_password) {

    private lateinit var binding: FragmentAccountPasswordBinding
    private lateinit var fragContext: Context
    private val getStartedViewModel by activityViewModels<GetStartedViewModel> {
        GetStartedViewModelFactory(fragContext)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentAccountPasswordBinding.bind(view)

        fragContext = view.context

        binding.btnNextAccountPassword.setOnClickListener{
            getStartedViewModel.savePassword(binding.editTextAccountPassword.text.toString())
            view.findNavController().navigate(R.id.action_accountPasswordFragment_to_locationFragment)
        }


    }
}