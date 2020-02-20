package com.module2.networkcallproj.Data.data.models

import androidx.lifecycle.LiveData
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

interface TourNewsModel {

//    fun getAllNews(
//        onSuccess : (TourNewsVO) -> Unit,
//        onFailure :(String) -> Unit
//    )

    fun getAllTours(onError: (message:String)->Unit): LiveData<List<TourVO>>
   // fun getAllToursFromApiAndSaveToDatabase(onSuccess:()->Unit, onError: (message: String) -> Unit)

    fun getAllCountry(onError: (message:String)->Unit): LiveData<List<CountryVO>>
    //fun getAllCountryFromApiAndSaveToDatabase(onSuccess:()->Unit, onError: (message: String) -> Unit)
   // fun getNewsById(newsId: Int): LiveData<TourNewsVO>
//    fun getAllTour(
//        onSuccess: (List<TourNewsVO>) -> Unit,onFailure: (String) -> Unit
//    )

}