package com.example.my

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Hello, Nikita
        // Hello
    }

    fun onClickTest1(view: View) {
        val number_1 = findViewById<EditText>(R.id.et1).text.toString().toInt()
        val number_2 = findViewById<EditText>(R.id.et2).text.toString().toInt()
        val value = findViewById<TextView>(R.id.text1)
        value.text = "${number_1 + number_2}"
    }

    fun onClickTest2(view: View) {
        val number_1 = findViewById<EditText>(R.id.et1).text.toString().toInt()
        val number_2 = findViewById<EditText>(R.id.et2).text.toString().toInt()
        val value = findViewById<TextView>(R.id.text1)
        value.text = "${number_1 - number_2}"
    }

    fun onClickTest3(view: View) {
        val number_1 = findViewById<EditText>(R.id.et1).text.toString().toInt()
        val number_2 = findViewById<EditText>(R.id.et2).text.toString().toInt()
        val value = findViewById<TextView>(R.id.text1)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener( View.OnClickListener {
            
        })
        value.text = "${number_1 * number_2}"
    }

    fun onClickTest4(view: View) {
        val number_1 = findViewById<EditText>(R.id.et1).text.toString().toInt()
        val number_2 = findViewById<EditText>(R.id.et2).text.toString().toInt()
        val value = findViewById<TextView>(R.id.text1)
        value.text = when (number_2) {
            0 -> "На ноль делить нельзя"
            else -> "${number_1 / number_2}"
        }
    }
}