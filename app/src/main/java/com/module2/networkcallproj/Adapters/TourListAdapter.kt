package com.module2.networkcallproj.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.R
import com.module2.networkcallproj.viewHolders.BaseNewsViewHolder
import com.module2.networkcallproj.viewHolders.TourViewHolder

class TourListAdapter : BaseRecyclerAdapter<BaseNewsViewHolder, TourVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_tour,parent,false)
        return TourViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mTourData.size
    }

//    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
//
//    }
}