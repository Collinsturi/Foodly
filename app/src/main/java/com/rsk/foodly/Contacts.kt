package com.rsk.foodly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_contacts)

        val imageViewMobileNumber: ImageView = findViewById(R.id.imageViewMobileNumber)
        imageViewMobileNumber.setOnClickListener{
            startActivity(Intent(this, EmailAddress::class.java))
        }
    }
}