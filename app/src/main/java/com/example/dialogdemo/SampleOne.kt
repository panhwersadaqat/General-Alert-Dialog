package com.example.dialogdemo

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class SampleOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_one)

        Dialog.showDialog(this)


        val t = Timer()
        t.schedule(object : TimerTask() {
            override fun run() {
                Dialog.dismissDialog()
                t.cancel()
            }
        }, 5000)
    }
}