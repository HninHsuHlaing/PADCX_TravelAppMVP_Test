package com.module2.networkcallproj.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.R
import com.module2.networkcallproj.viewHolders.BaseNewsViewHolder
import com.module2.networkcallproj.viewHolders.CountryViewHolder
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

class CountryListAdapter : BaseRecyclerAdapter<BaseNewsViewHolder, CountryVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return  CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mCountryData.size
    }


}