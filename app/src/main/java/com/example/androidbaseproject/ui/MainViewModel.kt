package com.example.androidbaseproject.ui

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidbaseproject.data.model.BaseResponse
import com.example.androidbaseproject.data.model.ResultResponse
import com.example.androidbaseproject.data.model.coin.coin.ListOfCoinResponse
import com.example.androidbaseproject.data.repository.CoinRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val repository: CoinRepository
) : ViewModel() {
    private val _coinsState = MutableLiveData<ResultResponse<BaseResponse<ListOfCoinResponse>>>(ResultResponse.Loading)
    val coinsState: LiveData<ResultResponse<BaseResponse<ListOfCoinResponse>>> = _coinsState

    fun getListOfCoin() {
        viewModelScope.launch() {
            _coinsState.postValue(ResultResponse.Loading)
            try {
                val orderDetails = repository.getListOfCoins(10,20)
                _coinsState.postValue(ResultResponse.Success(orderDetails))
            } catch (e: Exception) {
                _coinsState.postValue(ResultResponse.Error(e))
            }
        }
    }
}