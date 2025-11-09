package com.example.localfinder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BusinessAdapter(private val businessList: List<Business>) :
    RecyclerView.Adapter<BusinessAdapter.BusinessViewHolder>() {

    inner class BusinessViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.businessImage)
        val name: TextView = itemView.findViewById(R.id.businessName)
        val distance: TextView = itemView.findViewById(R.id.businessDistance)
        val rating: RatingBar = itemView.findViewById(R.id.businessRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusinessViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_business, parent, false)
        return BusinessViewHolder(view)
    }

    override fun onBindViewHolder(holder: BusinessViewHolder, position: Int) {
        val business = businessList[position]
        holder.image.setImageResource(business.imageResId)
        holder.name.text = business.name
        holder.distance.text = business.distance
        holder.rating.rating = business.rating
    }

    override fun getItemCount(): Int = businessList.size
}
