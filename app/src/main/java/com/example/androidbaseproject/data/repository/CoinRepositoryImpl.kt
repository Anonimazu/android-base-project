package com.example.androidbaseproject.data.repository

import com.example.androidbaseproject.data.model.BaseResponse
import com.example.androidbaseproject.data.model.ResultResponse
import com.example.androidbaseproject.data.model.coin.coin.ListOfCoinResponse
import com.example.androidbaseproject.data.remote.CoinService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinService: CoinService
) : CoinRepository {

    override suspend fun getListOfCoins(
        offset: Int?,
        limit: Int?
    ): BaseResponse<ListOfCoinResponse> {
        return coinService.getListOfCoins(offset, limit)
    }

}