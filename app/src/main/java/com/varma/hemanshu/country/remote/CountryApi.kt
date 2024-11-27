package com.varma.hemanshu.country.remote

import com.varma.hemanshu.country.models.CountryResponse
import retrofit2.Response
import retrofit2.http.GET

interface CountryApi {

    @GET("v3.1/subregion/asia")
    suspend fun getCountryInfo(): Response<List<CountryResponse>>



}