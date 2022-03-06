package com.example.dummies_hello_world

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var gugu: CheckBox
    lateinit var textView: TextView
    lateinit var checkBox2: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {

        gugu = findViewById(R.id.checkBox)
        checkBox2 = findViewById(R.id.checkBox2)
        //textView = findViewById(R.id.textView)

        val intent = Intent(this, MainActivity2::class.java)

        intent.putExtra("Peppers", gugu.isChecked)
        intent.putExtra("Extra Cheese", checkBox2.isChecked)

        startActivity(intent)
    }
}