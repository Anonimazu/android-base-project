package com.example.androidbaseproject.data.model.coin.coin

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class ListOfCoinResponse(
    @SerializedName("stats")
    var stats: Stats? = null,
    @SerializedName("coins")
    var coins: List<CoinData>? = null
) : Parcelable