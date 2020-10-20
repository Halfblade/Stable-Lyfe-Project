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
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }


        val buttonWesternPleasureTraining = findViewById<Button>(R.id.button21)
        val buttonWesternReiningTraining = findViewById<Button>(R.id.button22)
        val buttonEnglishDressageTraining = findViewById<Button>(R.id.button23)
        val buttonEnglishShowJumpingTraining = findViewById<Button>(R.id.button24)

        buttonWesternPleasureTraining.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.westernhorseuk.com/whuk-blog/western-pleasure-work-out"))
            startActivity(intent)
        }

        buttonWesternReiningTraining.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://horse-pros.com/5568/training-exercises-neck-reining"))
            startActivity(intent)
        }

        buttonEnglishDressageTraining.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://practicalhorsemanmag.com/training/developing-collection-without-resistance-karen-adams-part-1"))
            startActivity(intent)
        }

        buttonEnglishShowJumpingTraining.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://eventingconnect.today/2017/12/21/nine-show-jumping-exercises-to-keep-you-sane-and-sharp-this-winter/"))
            startActivity(intent)
        }
    }
}