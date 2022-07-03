package dev.wairimu.fibonacciapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter (var numbersList: List<Int>):
    RecyclerView.Adapter<NumbersViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
            var itemView= LayoutInflater.from(parent.context)
                .inflate(R.layout.fibonacci_numbers_item,parent,false)
            return  NumbersViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
            holder.tvSum.text = numbersList.get(position).toString()
        }

        override fun getItemCount(): Int {
            return numbersList.size
        }
    }
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvSum = itemView.findViewById<TextView>(R.id.tvSum)
    }
