package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpChoiceScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_choice_screen)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        val buttonLoginWithEmail = findViewById<Button>(R.id.button8)
        val buttonLoginWithGoogle = findViewById<Button>(R.id.button9)

        buttonLoginWithEmail.setOnClickListener{
            val intent = Intent(this, StablersHomePage::class.java)

            startActivity(intent)
        }

        buttonLoginWithGoogle.setOnClickListener {
            val intent = Intent(this, OwnersHomePage::class.java)

            startActivity(intent)
        }
    }
}