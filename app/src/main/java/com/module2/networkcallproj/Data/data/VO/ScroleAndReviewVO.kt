package com.module2.padc_x_network_call_assignment.Data.VO

import com.google.gson.annotations.SerializedName

data class ScroleAndReviewVO (

    @SerializedName("name")
    var name : String ="",

    @SerializedName("score")
    var score :Double =0.0,

    @SerializedName("max_score")
    var MaxScore : Int  =0,

    @SerializedName("total_reviews")
    var TotalReviews : Int = 0
)