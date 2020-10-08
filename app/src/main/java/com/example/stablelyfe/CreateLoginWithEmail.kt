package com.example.stablelyfe

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.annotation.NonNull
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class CreateLoginWithEmail : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_login_with_email)


        val buttonSignUpWithEmail = findViewById<Button>(R.id.button10)
        val mUserName = findViewById<EditText>(R.id.editTextTextPersonName)
        val mEmail = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val mPassword = findViewById<EditText>(R.id.editTextTextPassword2)
        val verifyPassword = findViewById<EditText>(R.id.editTextTextPassword3)

        auth = FirebaseAuth.getInstance()




        buttonSignUpWithEmail.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            val username = mUserName.toString().trim()
            val email = mEmail.text.toString().trim()
            val password = mPassword.text.toString().trim()
            val verifypassword = verifyPassword.toString().trim()

            if (TextUtils.isEmpty(email)) {
                mEmail.error = "Email is Required"

            }
            if (TextUtils.isEmpty(password)) {
                mPassword.error = "Password is Required"

            }


            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                        startActivity(intent)
                    } else {


                    }
                }

        }
    }
}