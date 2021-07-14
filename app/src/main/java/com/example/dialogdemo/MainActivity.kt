package com.example.dialogdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = findViewById<Button>(R.id.op_one)
        val two = findViewById<Button>(R.id.op_two)

        one.setOnClickListener {
            val i = Intent(this,SampleOne::class.java)
            startActivity(i)
        }

        two.setOnClickListener {
            val i = Intent(this,SampleTwo::class.java)
            startActivity(i)
        }
    }
}