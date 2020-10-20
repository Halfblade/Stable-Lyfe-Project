package com.example.stablelyfe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OwnersCheckInHorse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owners_check_in_horse)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
    }
}