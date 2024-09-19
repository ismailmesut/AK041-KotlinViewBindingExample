package com.ismailmesutmujde.kotlinviewbindingexample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.ismailmesutmujde.kotlinviewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var myTextView : TextView
    private lateinit var myButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonMake.setOnClickListener {
            Snackbar.make(it, "Hello", Snackbar.LENGTH_SHORT).show()
        }

        
        // *****************************************************************
        // Old Method : findViewById
        // The old method can be used but is inefficient.
        myTextView = findViewById(R.id.myTextView)
        myButton = findViewById(R.id.myButton)

        myButton.setOnClickListener {
            myTextView.text = "Hello"
        }
        // *****************************************************************

    }
}