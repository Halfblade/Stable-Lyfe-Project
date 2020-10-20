package com.example.stablelyfe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StableLyfeMessages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stable_lyfe_messages)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
    }
}