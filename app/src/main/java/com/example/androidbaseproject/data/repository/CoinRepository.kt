package com.example.androidbaseproject.data.repository

import com.example.androidbaseproject.data.model.BaseResponse
import com.example.androidbaseproject.data.model.ResultResponse
import com.example.androidbaseproject.data.model.coin.coin.ListOfCoinResponse
import kotlinx.coroutines.flow.Flow

interface CoinRepository {
    suspend fun getListOfCoins(offset: Int?, limit: Int?): BaseResponse<ListOfCoinResponse>
}
