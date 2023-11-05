package com.aniruddha.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val data: List<Element>) : RecyclerView.Adapter<AdapterClass.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textAtomicNumber: TextView = itemView.findViewById(R.id.atomic_number)
        val textSymbol: TextView = itemView.findViewById(R.id.symbol)
        val textElementName: TextView = itemView.findViewById(R.id.latin_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val element = data[position]
        holder.textAtomicNumber.text = element.atomicNumber.toString()
        holder.textSymbol.text = element.symbol
        holder.textElementName.text = element.elementName
    }

    override fun getItemCount(): Int {
        return data.size
    }
}
