package com.example.stablelyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        val buttonLogin = findViewById<Button>(R.id.button)
        val buttonSignUp = findViewById<Button>(R.id.button2)
        val mEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val mPassword = findViewById<EditText>(R.id.editTextTextPassword)

        buttonLogin.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            val email = mEmail.text.toString().trim()
            val password = mPassword.text.toString().trim()

            if (TextUtils.isEmpty(email)) {
                mEmail.error = "Email is Required"

            }
            if (TextUtils.isEmpty(password)) {
                mPassword.error = "Password is Required"

            }

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success

                        startActivity(intent)

                    } else {
                        // If sign in fails
                    }


                }

        }

        buttonSignUp.setOnClickListener{
            val intent = Intent(this, SignUpChoiceScreen::class.java)

            startActivity(intent)
        }
    }
}