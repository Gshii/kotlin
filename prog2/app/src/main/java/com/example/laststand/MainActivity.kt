package com.example.laststand

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.laststand.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButtonRegister.setOnClickListener {
            val email = binding.emailEdittextRegister.text.toString()
            val password = binding.passwordEdittextRegister.text.toString()

            Log.d("MainActivity", "Email is $email")
            Log.d("MainActivity", "Password: $password")
        }

        binding.alreadyHaveAccountTextView.setOnClickListener {
            Log.d("MainActivity","Try to show login activity")

            //launch the login activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
