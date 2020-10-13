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
import com.google.firebase.database.FirebaseDatabase

class CreateLoginWithEmail : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    private lateinit var data : FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_login_with_email)


        val buttonSignUpWithEmail = findViewById<Button>(R.id.button10)
        val mUserName = findViewById<EditText>(R.id.editTextTextPersonName)
        val mEmail = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val mPassword = findViewById<EditText>(R.id.editTextTextPassword2)
        val verifyPassword = findViewById<EditText>(R.id.editTextTextPassword3)

        auth = FirebaseAuth.getInstance()

        data = FirebaseDatabase.getInstance()



        buttonSignUpWithEmail.setOnClickListener {
            val intent = Intent(this, StablersHomePage::class.java)
            val username = mUserName.text.toString().trim()
            val email = mEmail.text.toString().trim()
            val password = mPassword.text.toString().trim()
            val verifypassword = verifyPassword.text.toString().trim()

            if (TextUtils.isEmpty(username)){
                mUserName.error = "Username is Required"
            }

            if (TextUtils.isEmpty(email)) {
                mEmail.error = "Email is Required"

            }
            if (TextUtils.isEmpty(password)) {
                mPassword.error = "Password is Required"

            }

            if (TextUtils.isEmpty(verifypassword)){
                verifyPassword.error = "Please re enter the password"
            }

            if (password != verifypassword){
                mPassword.error = "Passwords do not match"
            }


            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {

                        startActivity(intent)
                    } else {

                        mEmail.error = "This email is already active"
                    }
                }

        }
    }
}