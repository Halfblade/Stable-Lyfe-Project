package com.example.stablelyfe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class OwnersMyHorse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owners_my_horse)

        val checkboxSelectAll = findViewById<CheckBox>(R.id.checkBox4)

        val buttonAddMyHorse = findViewById<Button>(R.id.button25)

        buttonAddMyHorse.setOnClickListener {

        }

        if (checkboxSelectAll.isActivated){

        }

    }
}