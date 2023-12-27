package com.example.data_application

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.data_application.R

class ActivityLogin : AppCompatActivity() {
    lateinit var entername: EditText
    lateinit var enterpassword: EditText
    lateinit var loginbutton: Button
    lateinit var forgotpassword: EditText
    lateinit var signuptext: EditText
    val validname = "Saurav Palit"
    val validpass = "12345678"

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setContentView(R.layout.activity_login)

        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)

        if(isLoggedIn)
        {
            val intent = Intent (this,ActivityMain::class.java)
        }

        entername = findViewById(R.id.entername)
        enterpassword = findViewById(R.id.enterpassword)
        loginbutton = findViewById(R.id.loginbutton)
        forgotpassword = findViewById(R.id.forgotpassword) // Initialize forgotpassword
        signuptext = findViewById(R.id.signuptext)

        loginbutton.setOnClickListener {
            val name = entername.text.toString()
            val pass = enterpassword.text.toString()

            if (name == validname && pass == validpass) {
                val intent = Intent(this, ActivityMain::class.java)
                Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
                startActivity(intent)
            } else {
                Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_LONG).show()
            }
        }

        forgotpassword.setOnClickListener {
            val intent = Intent(this, ActivityForgotPassword::class.java)
            startActivity(intent)
        }

        signuptext.setOnClickListener {
            val intent = Intent(this, ActivitySignUp::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
    fun savePrefereneces()
    {
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }
}
