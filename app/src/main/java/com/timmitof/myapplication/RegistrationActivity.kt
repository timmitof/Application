package com.timmitof.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {

    lateinit var buttonLog: Button
    lateinit var btnLog:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnLog = findViewById(R.id.btnLogin2)
        buttonLog = findViewById(R.id.logBtn)
        buttonLog.setOnClickListener{
            onBackPressed()
        }

        btnLog.setOnClickListener {
            val login = Intent(this, HomeActivity::class.java)
            startActivity(login)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}