package com.timmitof.myapplication.fragments

 import android.content.Intent
 import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
 import android.widget.Button
 import android.widget.EditText
 import androidx.fragment.app.Fragment
 import com.timmitof.myapplication.HomeActivity
 import com.timmitof.myapplication.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {
    lateinit var loginEdit: EditText
    lateinit var passwordEdit: EditText
    lateinit var buttonLog: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        loginEdit = view.findViewById(R.id.loginIn)
        passwordEdit = view.findViewById(R.id.passwordIn)
        buttonLog = view.findViewById(R.id.btnLogin)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            buttonLog.setOnClickListener {
                val login = loginEdit.text.toString()
                val password = passwordEdit.text.toString()

                if (login.isEmpty()){
                    loginEdit.error = "Введите логин"
                    return@setOnClickListener
                }

                else if (password.isEmpty()){
                    passwordEdit.error = "Введите пароль"
                    return@setOnClickListener
                }

                if (login != null && password != null) {
                    val intent = Intent(requireActivity(), HomeActivity::class.java)
                    startActivity(intent)
                }

                replaceReg.setOnClickListener {
                    activity?.supportFragmentManager?.beginTransaction()
                        ?.replace(R.id.fragment_container, SecondFragment())?.commit()
            }
        }
    }
}