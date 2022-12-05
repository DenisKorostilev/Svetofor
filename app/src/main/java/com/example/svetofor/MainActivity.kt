package com.example.svetofor

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root_layout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)

        redButton.setOnClickListener {
            textView.text = "Красный"
            root_layout.setBackgroundColor(Color.RED)
        }

        yellowButton.setOnClickListener {
            textView.text = "Жёлтый"
            root_layout.setBackgroundColor(Color.YELLOW)
        }

        greenButton.setOnClickListener {
            textView.text = "Зелёный"
            root_layout.setBackgroundColor(Color.GREEN)
        }
    }
}