package com.example.a11pac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ShowActivity : AppCompatActivity() {
    private var bookList: MutableList<Expenses> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        var all_text = findViewById<TextView>(R.id.textView_all)
        getExpense()
        bookList.forEach{
            //Log.d("YO", it.toString())
            //all_text.text = bookList.toString()
            //Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show()
            //Log.d("YO", bookList.toString())
            val rv = findViewById<RecyclerView>(R.id.rv)

            val adapter = 
        }
    }
    private fun getExpense(){
        val preferences = getSharedPreferences("pref", MODE_PRIVATE)
        var json: String = ""
        if (!preferences.contains("json"))
        {
            return
        } else {
            json = preferences.getString("json", "NOT_JSON").toString()
        }
        val temp = Gson().fromJson<List<Expenses>>(json, object: TypeToken<List<Expenses>>(){}.type)
        bookList.addAll(temp)
    }
}