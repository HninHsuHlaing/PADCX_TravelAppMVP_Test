package com.module2.networkcallproj.network.DataAgents

import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO

interface TourNewsDataAgent {
    fun getAllNews(accesstoken : String,
                   onSuccess : (TourNewsVO) -> Unit,
                   onfailure : (String) -> Unit)

}