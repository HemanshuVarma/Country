package com.varma.hemanshu.country.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.varma.hemanshu.country.remote.CountryApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val URL = "https://restcountries.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .baseUrl(URL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()


object CountryApiService {

    val apiService: CountryApi by lazy {
        retrofit.create(CountryApi::class.java)
    }
}