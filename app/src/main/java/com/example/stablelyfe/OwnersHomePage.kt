package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OwnersHomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owners_home_page)


        val buttonMyHorse = findViewById<Button>(R.id.button11)


        buttonMyHorse.setOnClickListener {
            val intent = Intent(this, OwnersMyHorse::class.java)

            startActivity(intent)
        }
    }
}