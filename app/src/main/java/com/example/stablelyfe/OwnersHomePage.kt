package com.example.stablelyfe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser


class OwnersHomePage : AppCompatActivity() {
    //private var mAuth: FirebaseAuth? = null
    private lateinit var auth : FirebaseAuth;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_owners_home_page)


        auth = FirebaseAuth.getInstance();


        val buttonMyHorse = findViewById<Button>(R.id.button11)
        val buttonCheckInHorse = findViewById<Button>(R.id.button12)
        val buttonShopping = findViewById<Button>(R.id.button13)
        val buttonTraining = findViewById<Button>(R.id.button14)
        val buttonFinding = findViewById<Button>(R.id.button15)


        buttonMyHorse.setOnClickListener {
            val intent = Intent(this, OwnersMyHorse::class.java)

            startActivity(intent)
        }

        buttonCheckInHorse.setOnClickListener {
            val intent = Intent(this, OwnersCheckInHorse::class.java)

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

        buttonFinding.setOnClickListener {
            val intent = Intent(this, StableLyfeFinding::class.java)

            startActivity(intent)
        }



    


    }
}