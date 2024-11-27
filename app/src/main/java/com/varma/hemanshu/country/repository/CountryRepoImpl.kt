package com.varma.hemanshu.country.repository

import com.varma.hemanshu.country.models.CountryResponse
import com.varma.hemanshu.country.remote.CountryApi
import com.varma.hemanshu.country.utils.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CountryRepoImpl(private val api: CountryApi) : CountryRepo {

    override suspend fun getCountries(): UiState<List<CountryResponse>> {
        return withContext(Dispatchers.IO) {
            try {
                val response = api.getCountryInfo()
                if (response.isSuccessful) {
                    response.body()?.let {
                        UiState.Success(it)
                    } ?: UiState.Error("No Data Available")
                } else {
                    UiState.Error("Error fetching data")
                }
            } catch (exception: Exception) {
                UiState.Error("Exception: ${exception.message}")
            }
        }
    }
}