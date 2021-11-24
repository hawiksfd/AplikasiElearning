package com.example.aplikasielearning.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasielearning.R
import com.example.aplikasielearning.databinding.ActivityLoginBinding
import com.example.aplikasielearning.presentation.forgetpassword.ForgotPasswordActivity
import com.example.aplikasielearning.presentation.main.MainActivity
import com.example.aplikasielearning.presentation.register.RegisterActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)

        onAction()
    }

    private fun onAction(){
        loginBinding.apply {
            btnLogin.setOnClickListener {
                startActivity<MainActivity>()
            }

            btnRegister.setOnClickListener {
                startActivity<RegisterActivity>()
            }

            btnForgotPasswordLogin.setOnClickListener {
                startActivity<ForgotPasswordActivity>()
            }

        }
    }
}