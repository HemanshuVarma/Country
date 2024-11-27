package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Mon(
    @Json(name = "common")
    val common: String?,
    @Json(name = "official")
    val official: String?
) : Parcelable