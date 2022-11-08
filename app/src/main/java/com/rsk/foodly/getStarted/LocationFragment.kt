package com.rsk.foodly.getStarted

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rsk.foodly.PushNotificationsActivity
import com.rsk.foodly.R
import com.rsk.foodly.databinding.FragmentLocationBinding


class LocationFragment : Fragment(R.layout.fragment_location) {
    private lateinit var binding: FragmentLocationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLocationBinding.bind(view)

        binding.btnPush.setOnClickListener {
            startActivity(Intent(view.context, PushNotificationsActivity::class.java))
        }
    }
}