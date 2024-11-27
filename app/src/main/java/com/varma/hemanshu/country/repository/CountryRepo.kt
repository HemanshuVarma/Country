package com.varma.hemanshu.country.repository

import com.varma.hemanshu.country.models.CountryResponse
import com.varma.hemanshu.country.utils.UiState

interface CountryRepo {

    suspend fun getCountries(): UiState<List<CountryResponse>>


}