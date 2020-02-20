package com.module2.networkcallproj.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.module2.networkcallproj.R
import com.module2.padc_x_network_call_assignment.Data.VO.HotelVO
import kotlinx.android.synthetic.main.item_tour.view.*

class TourListRecyclerAdapter(var tourList: ArrayList<HotelVO>) : RecyclerView.Adapter<TourListRecyclerAdapter.TourVH>() {
    fun updateTours(tours: ArrayList<HotelVO>) {
        tourList.clear()
        tourList.addAll(tours)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = TourVH(
        LayoutInflater.from(parent.context).inflate(R.layout.item_tour, parent, false)
    )

    override fun getItemCount() = tourList.size

    override fun onBindViewHolder(holder: TourVH, position: Int) = holder.bind(tourList[position])

    class TourVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView = itemView.tourimg
        fun bind(tour: HotelVO) {
            Glide.with(itemView)
                .load(tour.photo.get(0))
                .into(imageView)
        }
    }
}