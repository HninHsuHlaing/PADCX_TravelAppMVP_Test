package com.module2.networkcallproj.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

abstract class BaseViewHolder(itemView :View) :RecyclerView.ViewHolder(itemView) {
    var mTourData : TourVO? = null
    var mCountryData : CountryVO? = null

    abstract fun BindTourData(data:TourVO)
    abstract fun BindCountryData(data : CountryVO)
}