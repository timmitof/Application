package com.timmitof.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var buttonReg: Button
    lateinit var buttonLog: Button
    lateinit var logIn: EditText
    lateinit var passIn: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonReg = findViewById(R.id.regBtn)
        buttonLog = findViewById(R.id.btnLogin)
        logIn = findViewById(R.id.loginIn)
        passIn = findViewById(R.id.passwordIn)

        buttonReg.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
            startActivity(intent)
        }

        buttonLog.setOnClickListener {
            val login = logIn.text.toString()
            val password = passIn.text.toString()

            if (login.isBlank()){
                logIn.error = "Введите логин"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            else if (password.isBlank()){
                passIn.error = "Введите Пароль"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (login != null && password != null) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }

        }
    }
}