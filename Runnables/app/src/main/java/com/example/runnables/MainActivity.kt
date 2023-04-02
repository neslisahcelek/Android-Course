package com.example.runnables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.runnables.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var number=0
    var runnable:Runnable = Runnable{} //tekrarlama için
    var handler:Handler = Handler() //süre ayarlama için
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun start(view: View){
        runnable = object : Runnable{
            override fun run() {
                number+=1
                binding.textViewNumber.text="$number"

                handler.postDelayed(this,1000)
                binding.buttonStart.setEnabled(false)
            }
        }
        handler.post(runnable)
    }
    fun stop(view:View){
        handler.removeCallbacks(runnable)
        binding.textViewNumber.text="$number"
    }
    fun restart(view: View){
        handler.removeCallbacks(runnable)
        number=0
        start(view)
    }

}