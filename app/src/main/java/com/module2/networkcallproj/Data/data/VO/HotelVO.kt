package com.module2.padc_x_network_call_assignment.Data.VO

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


data class HotelVO (


    @SerializedName("name")
    var name:String = "",

    @SerializedName("description")
    var description :String = "",

    @SerializedName("location")
    var location : String = "",

    @SerializedName("average_rating")
    var AverageRating :Double = 0.0,

    @SerializedName("scores_and_reviews")
    var ScoresAndReviews  :ArrayList<ScroleAndReviewVO> = arrayListOf(),

    @SerializedName("photos")
   var photo : ArrayList<String> = arrayListOf()

)