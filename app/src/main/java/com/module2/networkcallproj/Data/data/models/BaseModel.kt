package com.module2.networkcallproj.Data.data.models

import android.content.Context
import com.module2.networkcallproj.network.CountryApi
//import com.module2.networkcallproj.network.DataAgents.RetrofitDataAgent
import com.module2.networkcallproj.network.DataAgents.TourNewsDataAgent
import com.module2.networkcallproj.network.NewsApi
import com.module2.networkcallproj.persistence.dbs.CountryDb
import com.module2.networkcallproj.persistence.dbs.ToursDb
import com.module2.padc_x_network_call_assignment.Util.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BaseModel {
    //val mDataAgent : TourNewsDataAgent = RetrofitDataAgent
    protected  var mToursApi : NewsApi
   // protected lateinit var mTourDB : ToursDb

    protected  var mCountryApi : CountryApi
   // protected lateinit var mCountryDB : CountryDb

    init {
        val mOkHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(mOkHttpClient)
            .build()

        mToursApi = retrofit.create(NewsApi::class.java)
        mCountryApi = retrofit.create(CountryApi::class.java)
    }


//    fun initDatabase(context: Context){
//        mTourDB = ToursDb.getInstance(context)
//    }
}