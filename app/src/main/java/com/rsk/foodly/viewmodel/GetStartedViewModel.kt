package com.rsk.foodly.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.rsk.foodly.datastore.StoreUserData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class GetStartedViewModel(context: Context): ViewModel(){

    private var dataStore: StoreUserData =  StoreUserData(context)

    var phoneNo = 0
    fun saveUserMobileNumber(phoneNo: Int?){
        viewModelScope.launch {
            dataStore.saveUserMobileNumber(phoneNo)
        }
    }
    fun getUserMobileNumber(key: String){
        runBlocking(Dispatchers.IO) {
            phoneNo = dataStore.getUserMobileNumber(key)!!
        }
    }


    var emailAddress = ""
    fun saveEmailAddress(address: String){
        viewModelScope.launch {
            dataStore.saveUserEmail(address)
        }
    }

    fun getEmailAddress(key: String){
        viewModelScope.launch {
            dataStore.getUserEmail.first()
        }
    }



    fun savePassword(pass: String){
        viewModelScope.launch {
            dataStore.saveUserPassword(pass)
        }
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