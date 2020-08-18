package com.example.stablelyfe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StableLyfeTraining : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stable_lyfe_training)


        val buttonWesternPleasureTraining = findViewById<Button>(R.id.button21)


        buttonWesternPleasureTraining.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.westernhorseuk.com/whuk-blog/western-pleasure-work-out"))
            startActivity(intent)
        }
    }
}