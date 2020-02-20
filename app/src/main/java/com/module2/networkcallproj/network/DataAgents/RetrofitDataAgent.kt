package com.module2.networkcallproj.network.DataAgents

//package com.module2.networkcallproj.network.DataAgents
//
//import com.module2.networkcallproj.network.NewsApi
//import com.module2.networkcallproj.network.Responses.GetAllTourResponse
//import com.module2.padc_x_network_call_assignment.Data.VO.TourNewsVO
//import com.module2.padc_x_network_call_assignment.Util.BASE_URL
////import com.module2.padc_x_network_call_assignment.Network.Responses.GetAllToursResponse
////import com.module2.padc_x_network_call_assignment.Network.TourNewsApi
////import com.module2.padc_x_network_call_assignment.Util.Base_Url
//import com.module2.padc_x_network_call_assignment.Util.No_INTERNET_CONNECTION
//import okhttp3.OkHttpClient
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import java.util.concurrent.TimeUnit
//
//object RetrofitDataAgent :TourNewsDataAgent {
//
//    private  var mTourNewsApi : NewsApi? = null
//
//    init {
//
//        val mOkHttpClient = OkHttpClient.Builder()
//            .connectTimeout(15, TimeUnit.SECONDS)
//            .readTimeout(15, TimeUnit.SECONDS)
//            .writeTimeout(15, TimeUnit.SECONDS)
//            .build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(mOkHttpClient)
//            .build()
//        mTourNewsApi = retrofit.create(NewsApi::class.java)
//    }
//
//
//    override fun getAllNews(
//        accesstoken: String,
//        onSuccess: (TourNewsVO) -> Unit,
//        onfailure: (String) -> Unit) {
//
//        val getAllNewsCall = mTourNewsApi?.getAllNews(accesstoken)
//        getAllNewsCall?.enqueue(object :Callback <GetAllTourResponse>{
//            override fun onFailure(call: Call<GetAllTourResponse>, t: Throwable) {
//                onfailure(t.message?:"On Failure")
//            }
//
//            override fun onResponse(
//                call: Call<GetAllTourResponse>,
//                response: Response<GetAllTourResponse>
//            ) {
//
//                val getAllTourNewsResponse= response.body()
//                if (getAllTourNewsResponse != null){
//                    if(getAllTourNewsResponse.isResponseOK()){
//                        getAllTourNewsResponse.data?.let {
//                            onSuccess(it)
//                        }
//                    }else{
//                        onfailure(getAllTourNewsResponse.message)
//                    }
//
//                }else{
//                    onfailure(No_INTERNET_CONNECTION)
//                }
//            }
//        })
//    }
//
//
//}