package com.module2.networkcallproj.network

import com.module2.networkcallproj.network.Responses.GetAllCountryResponse
import com.module2.padc_x_network_call_assignment.Util.GET_ALL_COUNTRY
import com.module2.padc_x_network_call_assignment.Util.PARAM_ACCESS_TOKEN
import io.reactivex.Observable
import retrofit2.http.*

interface CountryApi {

    @GET(GET_ALL_COUNTRY)
    fun loadAllcountry(@Query(PARAM_ACCESS_TOKEN) accessToken: String) :Observable<GetAllCountryResponse>
}