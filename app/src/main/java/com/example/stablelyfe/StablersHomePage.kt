package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StablersHomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stablers_home_page)


        val buttonMyBarn = findViewById<Button>(R.id.button3)


        buttonMyBarn.setOnClickListener{
            val intent = Intent(this, StablersMyBarnPage::class.java)

            startActivity(intent)
        }
    }
}