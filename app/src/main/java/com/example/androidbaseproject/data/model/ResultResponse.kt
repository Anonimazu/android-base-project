package com.example.androidbaseproject.data.model

sealed class ResultResponse<out T> {
    data object Loading : ResultResponse<Nothing>()
    data class Success<T>(val data: T) : ResultResponse<T>()
    data class Error(val exception: Throwable) : ResultResponse<Nothing>()
}