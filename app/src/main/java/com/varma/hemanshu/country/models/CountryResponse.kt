package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CountryResponse(
    @Json(name = "flags")
    val countryFlag: Flags?,
    @Json(name = "name")
    val countryName: Name?,
) : Parcelable