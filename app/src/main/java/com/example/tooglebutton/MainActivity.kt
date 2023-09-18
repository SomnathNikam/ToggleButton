package com.example.tooglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tooglebutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.setOnClickListener {
              if (binding.toggleButton.text.toString() == "ON"){
                  binding.imageView.setImageResource(R.drawable.bulb10)
              }
            else{
                binding.imageView.setImageResource(R.drawable.bulbon)
              }

        }

    }
}