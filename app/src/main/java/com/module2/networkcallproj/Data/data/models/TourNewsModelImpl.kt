package com.module2.networkcallproj.Data.data.models

import androidx.lifecycle.LiveData
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.network.Responses.GetAllTourResponse
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
import com.module2.padc_x_network_call_assignment.Util.No_INTERNET_CONNECTION
import com.module2.padc_x_network_call_assignment.Util.PARAM_ACCESS_TOKEN
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object  TourNewsModelImpl :TourNewsModel, BaseModel() {

    override fun getAllTours(onError: (message: String) -> Unit): LiveData<List<TourVO>> {
      return  mTourDB.tourDao().getAllTours()

    }

//    override fun getAllToursFromApiAndSaveToDatabase(
//        onSuccess: () -> Unit,
//        onError: (message: String) -> Unit
//    ) {
//        mToursApi.loadAllTour(PARAM_ACCESS_TOKEN)
//            .map {
//                it.data.toList()
//            }
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe ({
//                mTourDB.tourDao().insertAllNews(it) },
//                {
//                    onError(it.localizedMessage ?: No_INTERNET_CONNECTION)
//                })
//
//    }

    override fun getAllCountry(onError: (message: String) -> Unit): LiveData<List<CountryVO>> {
        return mCountryDB.CountryDao().getAllCountry()
    }

//    override fun getAllCountryFromApiAndSaveToDatabase(
//        onSuccess: () -> Unit,
//        onError: (message: String) -> Unit
//    ) {
//        mCountryApi.loadAllcountry(PARAM_ACCESS_TOKEN)
//            .map {
//                it.data.toList()
//            }
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe({
//                mCountryDB.CountryDao().insertAllNews(it)
//            },{
//                onError(it.localizedMessage ?: No_INTERNET_CONNECTION)
//            })
//
//    }


//    override fun getAllNews(onSuccess: (TourNewsVO) -> Unit, onFailure: (String) -> Unit) {
//            mDataAgent.getAllNews(
//                PARAM_ACCESS_TOKEN,
//                onSuccess = {
//
//                    onSuccess.invoke(it)
//
//            },
//                onfailure = {
//                    onFailure.invoke(it)
//                })
//
//    }

//    override fun getAllTour(onSuccess: (List<TourNewsVO>) -> Unit, onFailure: (String) -> Unit) {
//        mDataAgent.getAllTour(PARAM_ACCESS_TOKEN,
//            onSuccess={
//                onSuccess.invoke(it)
//            },onfailure = {
//                onFailure.invoke(it)
//            })
//    }


}