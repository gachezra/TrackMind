package com.gachomo.trackmind.network

import com.gachomo.trackmind.model.ChannelModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("channels")
    fun getChannel(
        @Query("part") part: String,
        @Query("id") id: String
    ) : retrofit2.Call<ChannelModel>
}