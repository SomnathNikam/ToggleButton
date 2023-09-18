package com.example.tooglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tb = findViewById<ToggleButton>(R.id.toggleButton)
        var iv = findViewById<ImageView>(R.id.imageView)

            tb.setOnClickListener {
              if (tb.text.toString() == "ON")
                  iv.setImageResource(R.drawable.ic_launcher_foreground)
              else
                 iv.setImageResource(R.drawable.ic_launcher_background)


        }

    }
}