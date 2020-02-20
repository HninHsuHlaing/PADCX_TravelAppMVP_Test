package com.module2.networkcallproj.network

import com.module2.networkcallproj.network.Responses.GetAllTourResponse
import com.module2.padc_x_network_call_assignment.Util.GetAllNews
import com.module2.padc_x_network_call_assignment.Util.PARAM_ACCESS_TOKEN
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.*

interface NewsApi {
    @FormUrlEncoded
    @POST(GetAllNews)
    fun loadAllTour(@Field(PARAM_ACCESS_TOKEN) accessToken : String)
            : Observable<GetAllTourResponse>
}