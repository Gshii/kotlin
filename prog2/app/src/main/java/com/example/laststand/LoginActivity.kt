package com.example.laststand

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.laststand.databinding.ActivityLoginBinding

class LoginActivity: AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButtonRegister.setOnClickListener {
            val email = binding.email2EdittextRegister.text.toString()
            val password = binding.password2EdittextRegister.text.toString()

            Log.d("LoginActivity", "Email is $email")
            Log.d("LoginActivity", "Password: $password")
        }

        binding.backToRegistrationTextView.setOnClickListener {
            finish()
        }
    }
}
