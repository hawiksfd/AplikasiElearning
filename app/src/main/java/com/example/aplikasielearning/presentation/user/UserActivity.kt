package com.example.aplikasielearning.presentation.user

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.ACTION_LOCALE_SETTINGS
import com.example.aplikasielearning.R
import com.example.aplikasielearning.databinding.ActivityUserBinding
import com.example.aplikasielearning.presentation.changepassword.ChangePasswordActivity
import com.example.aplikasielearning.presentation.login.LoginActivity
import org.jetbrains.anko.startActivity

class UserActivity : AppCompatActivity() {
    private lateinit var userBinding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userBinding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(userBinding.root)

        onAction()
    }

    private fun onAction(){
        userBinding.apply {
            btnClose.setOnClickListener { finish() }
            btnChangeLanguage.setOnClickListener {
                startActivity(Intent(ACTION_LOCALE_SETTINGS))
            }
            btnChangePassword.setOnClickListener {
                startActivity<ChangePasswordActivity>()
            }
            btnLogoutUser.setOnClickListener {
                startActivity<Login Activity>()
                finishAffinity()
            }
        }
    }
}