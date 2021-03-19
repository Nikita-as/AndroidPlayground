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
    }

    fun onClickTest(view: View) {
        val edit = findViewById<EditText>(R.id.et1)
        val textBlog = findViewById<TextView>(R.id.text2)
        val value = edit.text.toString().toInt()
        textBlog.text = when (value) {
            in 0..99 -> "Ты начинающий ютубер"
            in 100..99999 -> "Ты успешный ютубер"
            in 10000..999999 -> "Ты популярный ютубер"
            else -> "Ты самый лучший ютубер"
        }

    }
}
