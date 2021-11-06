package com.timmitof.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    lateinit var buttonLog: Button
    lateinit var btnLog:Button
    lateinit var nameReg: EditText
    lateinit var logReg: EditText
    lateinit var passReg: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnLog = findViewById(R.id.btnLogin2)
        buttonLog = findViewById(R.id.logBtn)

        nameReg = findViewById(R.id.nameReg)
        logReg = findViewById(R.id.logReg)
        passReg = findViewById(R.id.passReg)

        buttonLog.setOnClickListener{
            onBackPressed()
        }

        btnLog.setOnClickListener {

            val name = nameReg.text.toString()
            val login = logReg.text.toString()
            val pass = passReg.text.toString()

            if (name.isEmpty()){
                nameReg.error = "Введите имя"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (login.isEmpty()){
                logReg.error = "Введите логин"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (pass.isEmpty()){
                passReg.error = "Введите пароль"
                Toast.makeText(this, "Заполните!", Toast.LENGTH_LONG).show()
            }

            else if (name.isBlank()){
                nameReg.error = "Введите имя"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (login.isBlank()){
                logReg.error = "Введите логин"
                Toast.makeText(this, "Заполните поля!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            else if (pass.isBlank()){
                passReg.error = "Введите пароль"
                Toast.makeText(this, "Заполните!", Toast.LENGTH_LONG).show()
            }

            if (name != null && login != null && pass != null) {
                val loginBtn = Intent(this, HomeActivity::class.java)
                startActivity(loginBtn)
            }
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}