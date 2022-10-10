package com.rsk.foodly

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class AccountPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_account_password)

        val btnContinueAccountPassword : ImageView = findViewById(R.id.btnContinueAccountPassword)
        btnContinueAccountPassword.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}