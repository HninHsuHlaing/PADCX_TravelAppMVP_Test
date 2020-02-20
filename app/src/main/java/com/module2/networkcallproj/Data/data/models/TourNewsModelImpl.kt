package com.module2.networkcallproj.Data.data.models

import android.annotation.SuppressLint
import android.content.Context
import androidx.lifecycle.LiveData
import com.module2.networkcallproj.Data.data.VO.CountryVO
import com.module2.networkcallproj.Data.data.VO.TourVO
import com.module2.networkcallproj.network.Responses.GetAllTourResponse
import com.module2.networkcallproj.persistence.dbs.CountryDb
import com.module2.networkcallproj.persistence.dbs.ToursDb
import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
import com.module2.padc_x_network_call_assignment.Util.No_INTERNET_CONNECTION
import com.module2.padc_x_network_call_assignment.Util.PARAM_ACCESS_TOKEN
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class  TourNewsModelImpl(var context: Context) :TourNewsModel, BaseModel() {

    private val mTourDB :ToursDb = ToursDb.getInstance(context)
    private  val mCountryDB :CountryDb = CountryDb.getInstance(context)

    override fun getAllTours(onError: (message: String) -> Unit): LiveData<List<TourVO>> {
        getAllTourFromApiAndSaveToDataBase(onError)
      return  mTourDB.tourDao().getAllTours()

    }

    @SuppressLint("CheckResult")
    private fun getAllTourFromApiAndSaveToDataBase(onError: (String) -> Unit){

        mToursApi.loadAllTour(PARAM_ACCESS_TOKEN)
            .map {
                it.data.toList()
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
                mTourDB.tourDao().insertAllNews(it)
            },{
                onError(it.localizedMessage ?: No_INTERNET_CONNECTION)
            })
    }

//

    override fun getAllCountry(onError: (message: String) -> Unit): LiveData<List<CountryVO>> {
        getAllCountryFromApiAndSaveToDataBase(onError)
        return mCountryDB.CountryDao().getAllCountry()
    }

    @SuppressLint("Check")
    private  fun getAllCountryFromApiAndSaveToDataBase(onError: (String) -> Unit){
        mCountryApi.loadAllcountry(PARAM_ACCESS_TOKEN)
            .map {
                it.data.toList()
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mCountryDB.CountryDao().insertAllNews(it)
            },{
                onError(it.localizedMessage ?: No_INTERNET_CONNECTION)
            })
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