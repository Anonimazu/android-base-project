package com.example.androidbaseproject.data.model.coin.coin

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class CoinData(
    @SerializedName("btcPrice")
    var btcPrice: String?,
    @SerializedName("change")
    var change: String?,
    @SerializedName("coinrankingUrl")
    var coinrankingUrl: String?,
    @SerializedName("color")
    var color: String?,
    @SerializedName("contractAddresses")
    var contractAddresses: List<String?>?,
    @SerializedName("24hVolume")
    var hVolume: String?,
    @SerializedName("iconUrl")
    var iconUrl: String?,
    @SerializedName("listedAt")
    var listedAt: Int?,
    @SerializedName("lowVolume")
    var lowVolume: Boolean?,
    @SerializedName("marketCap")
    var marketCap: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("price")
    var price: String?,
    @SerializedName("rank")
    var rank: Int?,
    @SerializedName("sparkline")
    var sparkline: List<String?>?,
    @SerializedName("symbol")
    var symbol: String?,
    @SerializedName("tier")
    var tier: Int?,
    @SerializedName("uuid")
    var uuid: String?
) : Parcelable