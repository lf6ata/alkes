package com.example.myapplication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityRegiterBinding

class RegiterAct : AppCompatActivity() {
    private var binding : ActivityRegiterBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegiterBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.btnToLogin.setOnClickListener{
            startActivity(Intent(this@RegiterAct, LoginActivity::class.java))
            finish()
        }
    }
}