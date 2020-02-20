package com.module2.networkcallproj.viewHolders

import android.view.View
import com.bumptech.glide.Glide
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
import kotlinx.android.synthetic.main.item_country.view.*

class CountryViewHolder(itemview :View) : BaseNewsViewHolder(itemview){

    override fun BindTourData(data: TourVO) {

    }

    override fun BindCountryData(data: CountryVO) {
        mCountryData = data
        Glide
            .with(itemView.context)
            .load(data.photo[0])
            .into(itemView.ivcountry)
            itemView.tvCountryName.text = data.location
    }
//    override fun BindTourData(data: TourNewsVO) {
//        mData = data
//        val count = data.country.size-1
//        for (i in 0..count){
//            var  imageurl = data.country.get(i).photo
//            //var countryname = data.country.get(i).name
//            Glide
//                .with(itemView.context)
//                .load(imageurl[i])
//                .into(itemView.ivcountry)
//            //itemView.tvCountryName.text = countryname.toString()
//        }
//
//    }

}