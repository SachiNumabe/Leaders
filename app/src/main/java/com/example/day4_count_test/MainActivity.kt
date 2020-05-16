package com.example.day4_count_test

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number :Int = 0
        textView.text = "0"


        plusButton.setOnClickListener {
            number = number + 1
            textView.text = number.toString()
            change(number)
        }

        minusButton.setOnClickListener {
            number = number - 1
            textView.text = number.toString()
            change(number)
        }

        resetButton.setOnClickListener {
            number = 0
            textView.text = number.toString()
            change(number)
        }
    }

    fun change( number: Int){
        if (number % 3 == 0 && number != 0){
            textView.setTextColor(Color.RED)
        }else{
            textView.setTextColor(Color.BLACK)
        }
    }
}
