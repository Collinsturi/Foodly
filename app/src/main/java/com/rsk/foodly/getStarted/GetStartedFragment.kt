package com.rsk.foodly.getStarted

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.findNavController
import com.rsk.foodly.mainscreen.MainActivity
import com.rsk.foodly.R
import com.rsk.foodly.databinding.FragmentGetStartedBinding

class GetStartedFragment : Fragment(R.layout.fragment_get_started) {

    private lateinit var binding: FragmentGetStartedBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGetStartedBinding.bind(view)

        binding.btnSkip.setOnClickListener {
            startActivity(Intent(view.context, MainActivity::class.java))
        }

        binding.btnGetStarted.setOnClickListener{
            view.findNavController().navigate(R.id.action_getStartedFragment_to_contactsFragment)
        }


    }
}