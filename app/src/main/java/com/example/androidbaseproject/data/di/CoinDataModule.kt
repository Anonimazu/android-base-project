package com.example.androidbaseproject.data.di

import com.example.androidbaseproject.data.remote.CoinService
import com.example.androidbaseproject.data.repository.CoinRepository
import com.example.androidbaseproject.data.repository.CoinRepositoryImpl
import com.example.androidbaseproject.util.ServiceUrl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CoinDataModule {
    @Provides
    @Singleton
    fun provideCoinService(
        gsonConverterFactory: GsonConverterFactory,
        okHttpClient: OkHttpClient
    ): CoinService {
        return Retrofit.Builder()
            .baseUrl(ServiceUrl.coinServiceUrl)
            .addConverterFactory(gsonConverterFactory)
            .client(okHttpClient)
            .build()
            .create(CoinService::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(
        coinService: CoinService
    ): CoinRepository {
        return CoinRepositoryImpl(coinService)
    }
}