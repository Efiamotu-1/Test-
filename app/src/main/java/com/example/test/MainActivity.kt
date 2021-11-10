package com.example.test

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.text.StringBuilder

class MainActivity : AppCompatActivity() {

    private val data = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number0: TextView = findViewById(R.id.number_0)
        number0.setOnClickListener {
            display("0" )
        }

        val number1: TextView = findViewById(R.id.number_1)
        number1.setOnClickListener {
            display("1")
        }

        val number2: TextView = findViewById(R.id.number_2)
        number2.setOnClickListener {
            display("2")
        }
        val number3: TextView = findViewById(R.id.number_3)
        number3.setOnClickListener {
            display("3")
        }

        val number4: TextView = findViewById(R.id.number_4)
        number4.setOnClickListener {
            display("4")
        }

        val number5: TextView = findViewById(R.id.number_5)
        number5.setOnClickListener {
            display("5")
        }

        val number6: TextView = findViewById(R.id.number_6)
        number6.setOnClickListener {
            display("6")
        }

        val number7: TextView = findViewById(R.id.number_7)
        number7.setOnClickListener {
            display("7")
        }

        val number8: TextView = findViewById(R.id.number_8)
        number8.setOnClickListener {
            display("8")
        }

        val number9: TextView = findViewById(R.id.number_9)
        number9.setOnClickListener {
            display("9")
        }

        val cancel: TextView = findViewById(R.id.cancel)
        cancel.setOnClickListener {
            data.clear()
            display(data.toString())
        }

        val delete = findViewById<ImageView>(R.id.delete)
        delete.setOnClickListener {

        }
        val continueButton  = findViewById<Button>(R.id.buttonShow)
        continueButton.setOnClickListener {
            val sheet = ActionBottom()
            sheet.show(supportFragmentManager, "action")
        }

    }


    private fun display(number: String) {
        val numbersTextView: TextView = findViewById(R.id.amount_text_view)
        data.append(number)
        numbersTextView.text = data.toString()
    }

}