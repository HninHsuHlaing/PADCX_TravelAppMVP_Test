package com.module2.networkcallproj.Data.data.VO

import android.provider.ContactsContract
import androidx.room.*
import com.google.gson.annotations.SerializedName
import com.module2.networkcallproj.persistence.PhotoTypeConverter
import com.module2.networkcallproj.persistence.ScroeAndReviewConverter
import com.module2.padc_x_network_call_assignment.Data.VO.ScroleAndReviewVO

@Entity(tableName = "tours_table")
@TypeConverters(ScroeAndReviewConverter::class,PhotoTypeConverter::class)
 class TourVO(
    @PrimaryKey
    @SerializedName("name")
    var name:String = "",

    @SerializedName("description")
    var description: String = "",

    @SerializedName("location")
    var location: String ="",

    @SerializedName("average_rating")
    var AverageRating:Double = 0.0,

    @Embedded
    @SerializedName("scores_and_reviews")
    var ScroleandReview: ArrayList<ScroleAndReviewVO> = arrayListOf(),

    @Embedded
    @SerializedName("photos")
    var photo: ArrayList<String> = arrayListOf()


)
