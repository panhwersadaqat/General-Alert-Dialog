package com.example.dialogdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SampleTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_two)

        val show = findViewById<Button>(R.id.show)

        show.setOnClickListener {
            Dialog.showDialog(this)
        }

    }
}