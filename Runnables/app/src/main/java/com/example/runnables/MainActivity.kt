package com.example.runnables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.runnables.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun start(view: View){
        number+=1
        binding.textViewNumber.text="$number"
    }
    fun stop(view:View){

    }
}