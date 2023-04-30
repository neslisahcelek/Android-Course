package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun fragmentone(view: View) {
        val fragmentManager = supportFragmentManager //fragment manager oluşturuldu
        val fragmentTransaction = fragmentManager.beginTransaction() //fragment işlemleri başlatıldı

        val firstFragment = Fragment1() //fragment1 oluşturuldu
        fragmentTransaction.replace(R.id.frame, firstFragment).commit() //fragment1 frameLayouta eklendi
    }
    fun fragmenttwo(view: View) {
        val fragmentManager = supportFragmentManager //fragment manager oluşturuldu
        val fragmentTransaction = fragmentManager.beginTransaction() //fragment işlemleri başlatıldı

        val secondFragment = Fragment2() //fragment2 oluşturuldu
        fragmentTransaction.replace(R.id.frame, secondFragment).commit() //fragment2 frameLayouta eklendi

    }
}