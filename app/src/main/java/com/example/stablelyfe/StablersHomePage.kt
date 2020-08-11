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
        val buttonAddRemoveHorses = findViewById<Button>(R.id.button4)
        val buttonShopping = findViewById<Button>(R.id.button5)
        val buttonTraining = findViewById<Button>(R.id.button6)

        buttonMyBarn.setOnClickListener{
            val intent = Intent(this, StablersMyBarnPage::class.java)

            startActivity(intent)
        }


        buttonAddRemoveHorses.setOnClickListener{
            val intent = Intent(this, StablersAddAndRemoveHorses::class.java)

            startActivity(intent)
        }


        buttonShopping.setOnClickListener {
            val intent = Intent(this, StableLyfeShopping::class.java)
            
            startActivity(intent)
        }


        buttonTraining.setOnClickListener {
            val intent = Intent(this, StableLyfeTraining::class.java)

            startActivity(intent)
        }
    }
}