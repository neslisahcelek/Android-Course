package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intents.databinding.ActivityMainBinding
import com.example.intents.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")

        Toast.makeText(applicationContext,"Welcome, $name",Toast.LENGTH_LONG).show()
        binding.textViewName.text = "Name: $name"
        binding.textViewUsername.text = "Username: $username"
    }
}