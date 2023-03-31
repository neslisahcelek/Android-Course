package com.example.intents

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.intents.databinding.ActivityMainBinding
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //nextAlert()

    }
     fun next(view:View){
        if (nextAlert()==true){
            val intent = Intent(applicationContext,SecondActivity::class.java)
            intent.putExtra("name",binding.editTextName.text.toString())
            intent.putExtra("username",binding.editTextNickname.text.toString())
            startActivity(intent)
            finish()
        }else{

        }
    }
    fun nextAlert():Boolean{
        val alert = AlertDialog.Builder(this)
        var result = true
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes") {dialog, which ->
            Toast.makeText(applicationContext,"Saved!",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No") {dialog, which ->
            Toast.makeText(applicationContext,"Not Saved!",Toast.LENGTH_LONG)
            result=false
        }
        alert.show()
        return result
    }

}