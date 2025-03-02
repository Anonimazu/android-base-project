package com.example.androidbaseproject.data.remote

import com.example.androidbaseproject.data.model.BaseResponse
import com.example.androidbaseproject.data.model.coin.coin.ListOfCoinResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinService {
    @GET("coins")
    suspend fun getListOfCoins(
        @Query("offset") offset: Int?,
        @Query("limit") limit: Int?
    ): BaseResponse<ListOfCoinResponse>
}