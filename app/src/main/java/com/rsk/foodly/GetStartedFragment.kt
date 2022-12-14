package com.rsk.foodly

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.rsk.foodly.databinding.FragmentGetStartedBinding

class GetStartedFragment : Fragment(R.layout.fragment_get_started) {

    private lateinit var binding: FragmentGetStartedBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGetStartedBinding.bind(view)

        binding.btnSkip.setOnClickListener {
            startActivity(Intent(view.context,MainActivity::class.java))
        }

        binding.btnGetStarted.setOnClickListener{
            view.findNavController().navigate(R.id.action_getStartedFragment_to_contactsFragment)
        }


    }
}