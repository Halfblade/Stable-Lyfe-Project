package com.example.stablelyfe

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class OwnersMyHorse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owners_my_horse)


        val checkboxSelectAll = findViewById<CheckBox>(R.id.checkBox4)
        val checkboxHorse1 = findViewById<CheckBox>(R.id.checkBox5)
        val checkboxHorse2 = findViewById<CheckBox>(R.id.checkBox6)
        val checkboxHorse3 = findViewById<CheckBox>(R.id.checkBox7)
        val checkboxHorse4 = findViewById<CheckBox>(R.id.checkBox8)
        val checkboxHorse5 = findViewById<CheckBox>(R.id.checkBox9)

        val buttonAddMyHorse = findViewById<Button>(R.id.button25)

        buttonAddMyHorse.setOnClickListener {

        }

        if (checkboxSelectAll.isActivated){
            checkboxHorse1.isChecked
            checkboxHorse2.isChecked
            checkboxHorse3.isChecked
            checkboxHorse4.isChecked
            checkboxHorse5.isChecked
        }

    }
}