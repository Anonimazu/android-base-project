package com.example.androidbaseproject.data.model.coin.coin

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stats(
    @SerializedName("total")
    var total: Int?,
    @SerializedName("total24hVolume")
    var total24hVolume: String?,
    @SerializedName("totalCoins")
    var totalCoins: Int?,
    @SerializedName("totalExchanges")
    var totalExchanges: Int?,
    @SerializedName("totalMarketCap")
    var totalMarketCap: String?,
    @SerializedName("totalMarkets")
    var totalMarkets: Int?
) : Parcelable