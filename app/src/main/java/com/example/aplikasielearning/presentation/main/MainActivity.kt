package com.example.aplikasielearning.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasielearning.R
import com.example.aplikasielearning.databinding.ActivityMainBinding
import com.example.aplikasielearning.presentation.user.UserActivity
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        onAction()

    }

    private fun onAction(){
        mainBinding.apply {
            ivUser.setOnClickListener{
                startActivity<UserActivity>()
            }
        }
    }
}