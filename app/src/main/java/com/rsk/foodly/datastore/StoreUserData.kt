package com.rsk.foodly.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class StoreUserData(private val context: Context) {

    companion object{
        private val Context.datastore: DataStore<Preferences> by preferencesDataStore("User data")
        val USER_MOBILE_NUMBER = intPreferencesKey("user_mobile_number")
        val USER_EMAIL = stringPreferencesKey("user_email")
        val USER_PASSWORD = stringPreferencesKey("account_password")
        val USER_LOCATION = stringPreferencesKey("user_location")
    }

    val getUserMobileNumber: Flow<Int> = context.datastore.data
        .map { preferences ->
            preferences[USER_MOBILE_NUMBER] ?: 0
        }

    suspend fun saveUserMobileNumber(number: Int){
        context.datastore.edit {userData ->
            userData[USER_MOBILE_NUMBER] = number
        }
    }

    val getUserEmail: Flow<String?> = context.datastore.data
        .map { preferences ->
            preferences[USER_EMAIL] ?: ""
        }

    suspend fun saveUserEmail(email: String){
        context.datastore.edit {
            it[USER_EMAIL] = email
        }
    }

    val getUserPassword: Flow<String?> = context.datastore.data
        .map { preferences ->
            preferences[USER_PASSWORD] ?: ""
        }

    suspend fun saveUserPassword(pass: String){
        context.datastore.edit {
            it[USER_PASSWORD] = pass
        }
    }

    val getUserLocation: Flow<String?> = context.datastore.data
        .map { preferences ->
            preferences[USER_LOCATION] ?: ""
        }

    suspend fun saveUserLocation(location: String){
        context.datastore.edit {
            it[USER_LOCATION] = location
        }
    }
}