package com.example.data_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ActivityForgotPassword : AppCompatActivity()
{
    lateinit var forgot01:EditText
    lateinit var forward:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        forgot01 = findViewById(R.id.forgot01)
        forward = findViewById(R.id.forward)

        forward.setOnClickListener{
            Toast.makeText(this,"Redirecting....",Toast.LENGTH_LONG).show()
            val intent = Intent(this, ActivityMain::class.java)
            startActivity(intent)
        }

    }
}