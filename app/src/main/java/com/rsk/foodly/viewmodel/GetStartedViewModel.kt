package com.rsk.foodly.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.rsk.foodly.datastore.StoreUserData
import kotlinx.coroutines.launch

class GetStartedViewModel(context: Context): ViewModel(){

    private var dataStore: StoreUserData =  StoreUserData(context)

    var phoneNo = 0


    fun saveUserMobileNumber(phoneNo: Int){
        viewModelScope.launch {
            dataStore.saveUserMobileNumber(phoneNo)
        }
        this.phoneNo = phoneNo
    }


}



class GetStartedViewModelFactory(private val context: Context): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GetStartedViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return GetStartedViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown VieModel class")
    }
}