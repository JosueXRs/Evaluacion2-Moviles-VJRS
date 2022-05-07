package com.tecsup.evaluacionapp.vistas.plate

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tecsup.evaluacionapp.R

class PlateViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_plate,parent,false)) {
    private var imgPlate: ImageView? = null
    private var textPlateTitle: TextView? = null
    private var textPlateCategory: TextView? = null
    private var textPlatePrice: TextView? = null
    private var textPlateDescription: TextView? = null

    init {
        imgPlate = itemView.findViewById(R.id.imgPlate)
        textPlateTitle = itemView.findViewById(R.id.textPlateTitle)
        textPlateCategory = itemView.findViewById((R.id.textPlateCategory))
        textPlatePrice = itemView.findViewById((R.id.textPlatePrice))
        textPlateDescription = itemView.findViewById((R.id.textPlateDescription))

    }

    fun bind(plate: Plate){
        textPlateTitle?.text = plate.title
        textPlateCategory?.text = plate.category
        textPlatePrice?.text = plate.price
        textPlateDescription?.text = plate.description
        imgPlate?.setImageResource(plate.imagen)
    }
}