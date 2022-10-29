package com.rsk.foodly

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.findNavController

class AccountPasswordFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_account_password, container, false)

        val btnAccountPasswordNextFrag: Button = view.findViewById(R.id.btnContinueAccountPassword)
        btnAccountPasswordNextFrag.setOnClickListener{
            startActivity(Intent(view.context, MainActivity::class.java))
        }
        return view
    }
}