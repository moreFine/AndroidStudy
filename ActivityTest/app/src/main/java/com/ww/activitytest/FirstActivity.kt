package com.ww.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
         initView()
    }
    private fun initView(){
        val button1 = findViewById<Button>(R.id.button_1)
        button1.setOnClickListener { onClick(button1) }
    }
    fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_1 ->
                Toast.makeText(this, "java123131314645646", Toast.LENGTH_LONG).show()
        }
    }
}