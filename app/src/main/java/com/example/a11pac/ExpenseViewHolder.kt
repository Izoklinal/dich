package com.example.a11pac

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    var name:TextView = itemView.findViewById(R.id.tvName)
    var cost:TextView = itemView.findViewById(R.id.tvCost)
}