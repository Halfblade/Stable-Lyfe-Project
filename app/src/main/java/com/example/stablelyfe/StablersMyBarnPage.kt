package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StablersMyBarnPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stablers_my_barn_page)



        val buttonSpecialNotes1 = findViewById<Button>(R.id.button26)
        val buttonSpecialNotes2 = findViewById<Button>(R.id.button28)
        val buttonSpecialNotes3 = findViewById<Button>(R.id.button29)
        val buttonSpecialNotes4 = findViewById<Button>(R.id.button31)
        val buttonSpecialNotes5 = findViewById<Button>(R.id.button32)

        buttonSpecialNotes1.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            startActivity(intent)
        }

        buttonSpecialNotes2.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            startActivity(intent)
        }

        buttonSpecialNotes3.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            startActivity(intent)
        }
        buttonSpecialNotes4.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            startActivity(intent)
        }
        buttonSpecialNotes5.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            startActivity(intent)
        }
    }


}