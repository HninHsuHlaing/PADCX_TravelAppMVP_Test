package com.module2.networkcallproj.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.module2.networkcallproj.Adapters.CountryListAdapter
import com.module2.networkcallproj.Adapters.TourListAdapter
import com.module2.networkcallproj.Data.data.models.TourNewsModel
import com.module2.networkcallproj.Data.data.models.TourNewsModelImpl
import com.module2.networkcallproj.R
import com.module2.networkcallproj.adapter.CountryListRecyclerAdapter
import com.module2.networkcallproj.adapter.TourListRecyclerAdapter
import com.module2.networkcallproj.persistence.dbs.CountryDb
import com.module2.networkcallproj.persistence.dbs.ToursDb
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private  val mTourNewsModel : TourNewsModel = TourNewsModelImpl
    private lateinit var mTourDb : ToursDb
    private  lateinit var mCountryDb : CountryDb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTourDb = ToursDb.getInstance(this)
        mCountryDb = CountryDb.getInstance(this)


        val mCountryList = CountryListAdapter()
        val LayoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL ,false)
        CountryRecycler.layoutManager = LayoutManager
        CountryRecycler.adapter = mCountryList


        val mTourList = TourListAdapter()
        val layout = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        TourRecycler.layoutManager = layout
        TourRecycler.adapter = mTourList

        mTourNewsModel.getAllTours (onError = {
            Log.d("Error",it)
        }).observe(this, Observer {
            if(it.isNotEmpty()){

               mTourList.setTourData(it)
            }
        }

        )
        mTourNewsModel.getAllCountry (onError = {
            Log.d("Error",it)
        }).observe(this, Observer {
            if (it.isNotEmpty()){
                mCountryList.setCountryData(it)
            }
        })


//        mTourNewsModel.getAllNews(onSuccess = {
//            //val countrylist = it.country
//
//
//            //mCountryList.updateCountries(it.country)
//            //mTourList.updateTours(it.PopularTours)
//        },
//            onFailure = {
//                //val message :String ="No Internet Connection"
//            })



//        mTourNewsModel.getAllTour(
//            onSuccess = {
//            val tourlist = it
//                mTourList.setNewsData(tourlist)
//                TourRecycler.adapter = mTourList
//        },onFailure = {
//
//        })
    }


}
