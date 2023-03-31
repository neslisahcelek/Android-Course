package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun next(view:View){
        val intent = Intent(applicationContext,SecondActivity::class.java)
        intent.putExtra("name",binding.editTextName.text.toString())
        intent.putExtra("username",binding.editTextNickname.text.toString())
        startActivity(intent)
    }

}