package com.example.androidbaseproject.data.model

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("status")
    var status: String? = null,
    @SerializedName("data")
    var data: T? = null,
)