package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.stablelyfe.fragments.PrimaryCareFragment
import com.example.stablelyfe.fragments.SpecialNotesFragment
import com.example.stablelyfe.fragments.SpecialityCareFragment

class StablersMyBarnPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stablers_my_barn_page)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }



        val buttonSpecialNotes1 = findViewById<Button>(R.id.button26)
        val buttonSpecialNotes2 = findViewById<Button>(R.id.button28)
        val buttonSpecialNotes3 = findViewById<Button>(R.id.button29)
        val buttonSpecialNotes4 = findViewById<Button>(R.id.button31)
        val buttonSpecialNotes5 = findViewById<Button>(R.id.button32)


        val buttonMassPrimaryCare = findViewById<Button>(R.id.button27)
        val buttonMassSpecialityCare = findViewById<Button>(R.id.button30)

        buttonSpecialNotes1.setOnClickListener {
            val intent = Intent(this, SpecialNotesFragment::class.java)
            startActivity(intent)
        }

        buttonSpecialNotes2.setOnClickListener {
            val intent = Intent(this, SpecialNotesFragment::class.java)
            startActivity(intent)
        }

        buttonSpecialNotes3.setOnClickListener {
            val intent = Intent(this, SpecialNotesFragment::class.java)
            startActivity(intent)
        }
        buttonSpecialNotes4.setOnClickListener {
            val intent = Intent(this, SpecialNotesFragment::class.java)
            startActivity(intent)
        }
        buttonSpecialNotes5.setOnClickListener {
            val intent = Intent(this, SpecialNotesFragment::class.java)
            startActivity(intent)
        }



        buttonMassPrimaryCare.setOnClickListener {
            val intent = Intent(this, PrimaryCareFragment::class.java)

        }

        buttonMassSpecialityCare.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)

        }
    }


}