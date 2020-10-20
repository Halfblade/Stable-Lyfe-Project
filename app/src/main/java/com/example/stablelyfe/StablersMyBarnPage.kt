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
        val buttonMessaging1 = findViewById<Button>(R.id.button33)
        val buttonMessaging2 = findViewById<Button>(R.id.button34)
        val buttonMessaging3 = findViewById<Button>(R.id.button35)
        val buttonMessaging4 = findViewById<Button>(R.id.button36)
        val buttonMessaging5 = findViewById<Button>(R.id.button37)

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


/////////////////////////////////Primary and Speciality Mass Messaging//////////////////////////////
        buttonMassPrimaryCare.setOnClickListener {
            val intent = Intent(this, PrimaryCareFragment::class.java)
            startActivity(intent)

        }

        buttonMassSpecialityCare.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)

        }



        ////////////////////Messaging Fragment////////////////////////////////////

        buttonMessaging1.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)
        }

        buttonMessaging2.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)
        }
        buttonMessaging3.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)
        }
        buttonMessaging4.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)
        }
        buttonMessaging5.setOnClickListener {
            val intent = Intent(this, SpecialityCareFragment::class.java)
            startActivity(intent)
        }
    }


}