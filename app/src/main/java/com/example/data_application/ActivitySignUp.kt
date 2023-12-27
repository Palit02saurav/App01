package com.example.data_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ActivitySignUp : AppCompatActivity() {
    lateinit var enternamu: EditText
    lateinit var enterusername: EditText
    lateinit var entermail: EditText
    lateinit var password: EditText
    lateinit var confirmpassword: EditText
    lateinit var registerbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        enternamu = findViewById(R.id.enternamu)
        enterusername = findViewById(R.id.enterusername)
        entermail = findViewById(R.id.entermail)
        password = findViewById(R.id.password)
        confirmpassword = findViewById(R.id.confirmpassword)

        registerbutton.setOnClickListener {
            Toast.makeText(this, "Logged In", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ActivityMain::class.java)
            startActivity(intent)
        }
    }
}