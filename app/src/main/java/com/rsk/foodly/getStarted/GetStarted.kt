package com.rsk.foodly.getStarted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.rsk.foodly.R
import com.rsk.foodly.viewmodel.GetStartedViewModel

class GetStarted : AppCompatActivity() {

    private val viewModel: GetStartedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTheme(R.style.Theme_Foodly)

        setContentView(R.layout.activity_get_started)

    }
}