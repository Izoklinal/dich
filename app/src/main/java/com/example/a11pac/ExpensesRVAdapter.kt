package com.example.a11pac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ExpensesRVAdapter(context: Context?, val data:MutableList<Expenses>) : RecyclerView.Adapter<ExpenseViewHolder?>() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val view: View = layoutInflater.inflate(R.layout.activity_item_exepense, parent, false)
        return ExpenseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val item = data[position]
        holder.name.text = item.name
        holder.cost.text = item.cost.toString()
    }

    override fun getItemCount(): Int = data.size


}