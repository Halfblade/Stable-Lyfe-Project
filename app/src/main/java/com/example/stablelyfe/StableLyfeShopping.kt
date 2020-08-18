package com.example.stablelyfe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StableLyfeShopping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stable_lyfe_shopping)

        val buttonBrowseSaddles = findViewById<Button>(R.id.button16)
        val buttonBrowseSaddlePads = findViewById<Button>(R.id.button17)
        val buttonBrowseBits = findViewById<Button>(R.id.button18)


        buttonBrowseSaddles.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Equestrian-Saddles/b?ie=UTF8&node=3407621.kh"))
            startActivity(intent)
        }


        buttonBrowseSaddlePads.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Equestrian-Saddle-Pads/b?ie=UTF8&node=3407401.kh"))
            startActivity(intent)
        }

        buttonBrowseBits.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Horse-Bits/s?k=Horse+Bits.kh"))
            startActivity(intent)
        }
    }
}