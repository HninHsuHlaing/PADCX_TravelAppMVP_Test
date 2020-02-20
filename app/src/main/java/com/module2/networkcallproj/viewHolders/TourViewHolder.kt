package com.module2.networkcallproj.viewHolders

import android.view.View
import com.bumptech.glide.Glide
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
import kotlinx.android.synthetic.main.item_country.view.*

class TourViewHolder(itemview : View) :BaseNewsViewHolder(itemview) {


    override fun BindCountryData(data: CountryVO) {

    }

    override fun BindTourData(data: TourVO) {
        mTourData = data
        Glide
            .with(itemView.context)
            .load(data.photo[0])
            .into(itemView.ivcountry)
        itemView.tvCountryName.text = data.location
    }

//    override fun BindData(data: TourNewsVO) {
////        mData = data
////        val count = data.country.size-1
////        for (i in 0..count){
////            var  imageurl = data.PopularTours.get(i).photo
////            //var countryname = data.country.get(i).name
////            Glide
////                .with(itemView.context)
////                .load(imageurl[i])
////                .into(itemView.ivtourlogo)
////            //itemView.tvCountryName.text = countryname.toString()
//   //     }
//    }

}