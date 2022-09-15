package com.example.a11pac

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val btn = findViewById<Button>(R.id.add_button)

    //val expense: Expenses = Gson().fromJson("expenses.json", Expenses)
}