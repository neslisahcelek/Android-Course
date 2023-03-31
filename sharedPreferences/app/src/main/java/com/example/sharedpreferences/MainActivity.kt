package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences:SharedPreferences
    var number1:Int? = null
    var number2:Int?=null
    var result:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferences = this.getSharedPreferences(
            "com.example.sharedpreferences",Context.MODE_PRIVATE)

        var resultFromPreferences = sharedPreferences.getInt("result",0)
        findViewById<TextView>(R.id.resultText).text = "Result is: $resultFromPreferences"
    }
    fun sum(view:View){
        number1=findViewById<TextView>(R.id.editTextNumber1).text.toString().toInt()
        number2=findViewById<TextView>(R.id.editTextNumber2).text.toString().toInt()
        if (number1== null||number2 == null){
            findViewById<TextView>(R.id.resultText).text = "Please enter a valid number."
        }else {
            result = number1!! + number2!!
            sharedPreferences.edit().putInt("result",result!!).apply()
            findViewById<TextView>(R.id.resultText).text = "Result is: $result"
        }
    }
    fun sub(view:View){
        number1=findViewById<TextView>(R.id.editTextNumber1).text.toString().toInt()
        number2=findViewById<TextView>(R.id.editTextNumber2).text.toString().toInt()
        if (number1== null||number2 == null){
            findViewById<TextView>(R.id.resultText).text = "Please enter a valid number."
        }else {
            result = number1!! - number2!!
            sharedPreferences.edit().putInt("result",result!!).apply()
            findViewById<TextView>(R.id.resultText).text = "Result is: $result"
        }
    }
    fun mul(view:View){
        number1=findViewById<TextView>(R.id.editTextNumber1).text.toString().toInt()
        number2=findViewById<TextView>(R.id.editTextNumber2).text.toString().toInt()
        if (number1== null||number2 == null){
            findViewById<TextView>(R.id.resultText).text = "Please enter a valid number."
        }else {
            result = number1!! * number2!!
            sharedPreferences.edit().putInt("result",result!!).apply()
            findViewById<TextView>(R.id.resultText).text = "Result is: $result"
        }
    }
    fun div(view:View){
        number1=findViewById<TextView>(R.id.editTextNumber1).text.toString().toInt()
        number2=findViewById<TextView>(R.id.editTextNumber2).text.toString().toInt()
        if (number1== null||number2 == null){
            findViewById<TextView>(R.id.resultText).text = "Please enter a valid number."
        }else {
            result = number1!! / number2!!
            sharedPreferences.edit().putInt("result",result!!).apply()
            findViewById<TextView>(R.id.resultText).text = "Result is: $result"
        }
    }
}