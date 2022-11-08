package com.rsk.foodly.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.rsk.foodly.constUSER_EMAIL
import com.rsk.foodly.constUSER_LOCATION
import com.rsk.foodly.constUSER_MOBILE_NUMBER
import com.rsk.foodly.constUSER_PASSWORD
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map


class StoreUserData(private val context: Context) {

    companion object{
        private val Context.datastore: DataStore<Preferences> by preferencesDataStore("User data")
        val USER_MOBILE_NUMBER = intPreferencesKey(constUSER_MOBILE_NUMBER)
        val USER_EMAIL = stringPreferencesKey(constUSER_EMAIL)
        val USER_PASSWORD = stringPreferencesKey(constUSER_PASSWORD)
        val USER_LOCATION = stringPreferencesKey(constUSER_LOCATION)
    }

    val getUserMobileNumber: Flow<Int> = context.datastore.data
        .map { preferences ->
            preferences[USER_MOBILE_NUMBER] ?: 0
        }

    suspend fun getUserMobileNumber(key: String):Int?{
        val datastorekey = intPreferencesKey(key)
        val preferences = context.datastore.data.first()

        return preferences[datastorekey]
    }

    suspend fun saveUserMobileNumber(number: Int?){
        context.datastore.edit {userData ->
            userData[USER_MOBILE_NUMBER] = number ?: 0
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