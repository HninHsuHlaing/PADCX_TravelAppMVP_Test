package com.module2.networkcallproj.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.module2.networkcallproj.R
import com.module2.padc_x_network_call_assignment.Data.VO.HotelVO
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListRecyclerAdapter(var countriesList: ArrayList<HotelVO>) : RecyclerView.Adapter<CountryListRecyclerAdapter.CountryVH>() {

    fun updateCountries(countries: ArrayList<HotelVO>) {
        countriesList.clear()
        countriesList.addAll(countries)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryVH(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countriesList.size

    override fun onBindViewHolder(holder: CountryVH, position: Int) = holder.bind(countriesList[position])

    class CountryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView = itemView.ivcountry
        fun bind(country: HotelVO) {
            Glide.with(itemView)
                .load(country.photo.get(0))
                .into(imageView)
        }
    }
}