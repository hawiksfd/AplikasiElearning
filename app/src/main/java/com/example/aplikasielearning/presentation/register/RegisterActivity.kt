package com.example.aplikasielearning.presentation.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasielearning.R
import com.example.aplikasielearning.databinding.ActivityRegisterBinding
import com.example.aplikasielearning.presentation.main.MainActivity
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var registerbinding : ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerbinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerbinding.root)

        onAction()

    }

    private fun onAction() {
        registerbinding.apply {
            btnCloseRegister.setOnClickListener {
                finish()
            }

            btnRegister.setOnClickListener {
                toast("Register Succer")
            }

        }
    }
}