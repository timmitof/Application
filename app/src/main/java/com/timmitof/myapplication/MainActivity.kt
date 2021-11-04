package com.timmitof.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonReg: Button
    lateinit var buttonLog: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonReg = findViewById(R.id.regBtn)
        buttonLog = findViewById(R.id.btnLogin)
        buttonReg.setOnClickListener{
            val registration = Intent(this, RegistrationActivity::class.java)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            startActivity(registration)
        }

        buttonLog.setOnClickListener{
            val login = Intent(this, HomeActivity::class.java)
            startActivity(login)
        }

    }
}