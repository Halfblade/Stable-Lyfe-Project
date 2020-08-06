package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.button)
        val buttonSignUp = findViewById<Button>(R.id.button2)


        buttonLogin.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)

            startActivity(intent)
        }

        buttonSignUp.setOnClickListener{
            val intent = Intent(this, SignUpChoiceScreen::class.java)

            startActivity(intent)
        }
    }
}