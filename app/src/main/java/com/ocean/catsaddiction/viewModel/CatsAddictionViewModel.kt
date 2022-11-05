package com.ocean.catsaddiction.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ocean.catsaddiction.network.CatsApi
import kotlinx.coroutines.launch

class CatsAddictionViewModel : ViewModel() {
    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()
    public var newUrl = ""

    // The external immutable LiveData for the request status
    val status: LiveData<String> = _status
    init {
        Log.d("CatsApp", "init model")
        getCatsPhoto()
    }

    fun getCatsPhoto() {
        viewModelScope.launch {
            val catResult = CatsApi.retrofitService.getPhoto()
            Log.d("CatsApp", "The photo have been got ${catResult.url}")
            _status.value = "Success: ${catResult.tags} cat photos retrieved"
            newUrl = catResult.url.toString()
        }
    }
}