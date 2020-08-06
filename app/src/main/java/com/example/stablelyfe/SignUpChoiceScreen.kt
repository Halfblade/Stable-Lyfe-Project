package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpChoiceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_choice_screen)

        val buttonLoginWithEmail = findViewById<Button>(R.id.button8)


        buttonLoginWithEmail.setOnClickListener{
            val intent = Intent(this, CreateLoginWithEmail::class.java)

            startActivity(intent)
        }
    }
}