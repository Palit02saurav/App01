package com.example.data_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.data_application.R

class ActivityMain : AppCompatActivity() {
    lateinit var textforphysics02: TextView
    lateinit var textforphysics04: TextView
    lateinit var textforphysics12: TextView
    lateinit var textforphysics15: TextView
    lateinit var textforphysics18: TextView
    lateinit var textforphysics09: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textforphysics02 = findViewById(R.id.textforphysics02)
        textforphysics04 = findViewById(R.id.textforphysics04)
        textforphysics12 = findViewById(R.id.textforphysics12)
        textforphysics15 = findViewById(R.id. textforphysics15)
        textforphysics18 = findViewById(R.id.textforphysics18)
        textforphysics09 = findViewById(R.id.textforphysics09)

        textforphysics02.movementMethod = LinkMovementMethod.getInstance()
        textforphysics04.movementMethod = LinkMovementMethod.getInstance()
        textforphysics12.movementMethod = LinkMovementMethod.getInstance()
        textforphysics15.movementMethod = LinkMovementMethod.getInstance()
        textforphysics18.movementMethod = LinkMovementMethod.getInstance()
        textforphysics09.movementMethod = LinkMovementMethod.getInstance()
    }
}