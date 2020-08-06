package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateLoginWithEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_login_with_email)


        val buttonSignUpWithEmail = findViewById<Button>(R.id.button10)


        buttonSignUpWithEmail.setOnClickListener{
            val intent = Intent(this, StablersHomePage::class.java)

            startActivity(intent)
        }
    }
}