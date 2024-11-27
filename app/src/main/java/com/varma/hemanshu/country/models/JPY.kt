package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class JPY(
    @Json(name = "name")
    val name: String?,
    @Json(name = "symbol")
    val symbol: String?
) : Parcelable