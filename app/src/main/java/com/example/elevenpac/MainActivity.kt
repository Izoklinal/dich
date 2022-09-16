package com.example.elevenpac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_add: Button = findViewById(R.id.button_add)
        val btn_checkList: Button = findViewById(R.id.button_checkList)
        val name: EditText = findViewById(R.id.editText_name)
        val cost: EditText = findViewById(R.id.editText_cost)
        btn_add.setOnClickListener(View.OnClickListener {
            var temp: ExpensesBook = ExpensesBook(name.text, cost.text.toString().toInt())
            Toast.makeText(this, "FUCK", Toast.LENGTH_SHORT).show()
            //val book: ExpensesBook = Gson().fromJson("File.json", ExpensesBook::class.java)
        })
    }


}