package com.rsk.foodly

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class EmailAddress: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_email_address)

        val btnEmailAddress: ImageView= findViewById(R.id.btnContinueEmailAddress)
        btnEmailAddress.setOnClickListener {
            startActivity(Intent(this, AccountPassword::class.java))
        }
    }
}