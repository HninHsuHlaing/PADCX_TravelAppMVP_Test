package com.module2.networkcallproj.Adapters

import androidx.recyclerview.widget.RecyclerView
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.viewHolders.BaseViewHolder
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

abstract class BaseRecyclerAdapter <T: BaseViewHolder, W> : RecyclerView.Adapter<T>(){

    var mTourData : MutableList<TourVO> = mutableListOf()
    var mCountryData :MutableList<CountryVO> = mutableListOf()

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.BindTourData(mTourData[position])
        holder.BindCountryData(mCountryData[position])
    }

    fun setTourData(data: List<TourVO>){
        mTourData.clear()
        mTourData.addAll(data)
        notifyDataSetChanged()
    }
    fun setCountryData(data :List<CountryVO>){
        mCountryData.clear()
        mCountryData.addAll(data)
        notifyDataSetChanged()
    }


//    override fun getItemCount(): Int {
//        System.out.print(mData.size)
//        return mData.size
//    }

}