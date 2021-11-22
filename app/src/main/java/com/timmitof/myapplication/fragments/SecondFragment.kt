package com.timmitof.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.timmitof.myapplication.HomeActivity
import com.timmitof.myapplication.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    lateinit var buttonLog: Button
    lateinit var btnLog: Button
    lateinit var nameReg: EditText
    lateinit var logReg: EditText
    lateinit var passReg: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLog = view.findViewById(R.id.btnLogin2)
        buttonLog = view.findViewById(R.id.logBtn)

        nameReg = view.findViewById(R.id.nameReg)
        logReg = view.findViewById(R.id.logReg)
        passReg = view.findViewById(R.id.passReg)

        btnLog.setOnClickListener {

            val name = nameReg.text.toString()
            val login = logReg.text.toString()
            val pass = passReg.text.toString()

            if (name.isEmpty()){
                nameReg.error = "Введите имя"
                return@setOnClickListener
            }

            else if (login.isEmpty()){
                logReg.error = "Введите логин"
                return@setOnClickListener
            }

            else if (pass.isEmpty()){
                passReg.error = "Введите пароль"
                return@setOnClickListener
            }

            else if (name.isBlank()){
                nameReg.error = "Введите имя"
                return@setOnClickListener
            }

            else if (login.isBlank()){
                logReg.error = "Введите логин"
                return@setOnClickListener
            }

            else if (pass.isBlank()){
                passReg.error = "Введите пароль"
                return@setOnClickListener
            }

            if (name != null && login != null && pass != null) {
                val intent = activity?.startActivity(intent, )
                startActivity(intent)
            }

            replaceLog.setOnClickListener {
                activity?.supportFragmentManager
                    ?.beginTransaction()
                    ?.replace(R.id.fragment_container, FirstFragment())
                    ?.commit()
            }
        }
    }
}