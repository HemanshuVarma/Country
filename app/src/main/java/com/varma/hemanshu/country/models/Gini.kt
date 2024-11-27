package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Gini(
    @Json(name = "1998")
    val x1998: Double?,
    @Json(name = "2003")
    val x2003: Double?,
    @Json(name = "2005")
    val x2005: Double?,
    @Json(name = "2010")
    val x2010: Double?,
    @Json(name = "2011")
    val x2011: Double?,
    @Json(name = "2012")
    val x2012: Double?,
    @Json(name = "2013")
    val x2013: Double?,
    @Json(name = "2014")
    val x2014: Double?,
    @Json(name = "2015")
    val x2015: Double?,
    @Json(name = "2016")
    val x2016: Double?,
    @Json(name = "2017")
    val x2017: Double?,
    @Json(name = "2018")
    val x2018: Double?,
    @Json(name = "2019")
    val x2019: Double?
) : Parcelable