package com.module2.networkcallproj.network.Responses

import com.google.gson.annotations.SerializedName
import com.module2.networkcallproj.Data.data.VO.CountryVO

class GetAllCountryResponse(

    @SerializedName("code")
    val code :Int= 0,

    @SerializedName("message")
    val message :String ="",

    @SerializedName("data")
    val data : ArrayList<CountryVO> = arrayListOf()
) {
    fun isResponseOK() : Boolean = (data != null )
}