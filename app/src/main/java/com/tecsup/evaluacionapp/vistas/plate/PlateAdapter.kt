package com.tecsup.evaluacionapp.vistas.plate
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlateAdapter(val list:List<Plate>):RecyclerView.Adapter<PlateViewHolder>() {
    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlateViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlateViewHolder(inflater, parent)
    }
    override fun onBindViewHolder(holder: PlateViewHolder, position: Int) {
        val plate = list[position]
        holder.bind(plate)
    }

}