package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class Languages(
    @Json(name = "ara")
    val ara: String?,
    @Json(name = "arc")
    val arc: String?,
    @Json(name = "aze")
    val aze: String?,
    @Json(name = "ben")
    val ben: String?,
    @Json(name = "ckb")
    val ckb: String?,
    @Json(name = "div")
    val div: String?,
    @Json(name = "dzo")
    val dzo: String?,
    @Json(name = "eng")
    val eng: String?,
    @Json(name = "fas")
    val fas: String?,
    @Json(name = "fil")
    val fil: String?,
    @Json(name = "fra")
    val fra: String?,
    @Json(name = "heb")
    val heb: String?,
    @Json(name = "hin")
    val hin: String?,
    @Json(name = "hye")
    val hye: String?,
    @Json(name = "ind")
    val ind: String?,
    @Json(name = "jpn")
    val jpn: String?,
    @Json(name = "kat")
    val kat: String?,
    @Json(name = "kaz")
    val kaz: String?,
    @Json(name = "khm")
    val khm: String?,
    @Json(name = "kir")
    val kir: String?,
    @Json(name = "kor")
    val kor: String?,
    @Json(name = "lao")
    val lao: String?,
    @Json(name = "mon")
    val mon: String?,
    @Json(name = "msa")
    val msa: String?,
    @Json(name = "mya")
    val mya: String?,
    @Json(name = "nep")
    val nep: String?,
    @Json(name = "por")
    val por: String?,
    @Json(name = "prs")
    val prs: String?,
    @Json(name = "pus")
    val pus: String?,
    @Json(name = "rus")
    val rus: String?,
    @Json(name = "sin")
    val sin: String?,
    @Json(name = "tam")
    val tam: String?,
    @Json(name = "tet")
    val tet: String?,
    @Json(name = "tgk")
    val tgk: String?,
    @Json(name = "tha")
    val tha: String?,
    @Json(name = "tuk")
    val tuk: String?,
    @Json(name = "tur")
    val tur: String?,
    @Json(name = "urd")
    val urd: String?,
    @Json(name = "uzb")
    val uzb: String?,
    @Json(name = "vie")
    val vie: String?,
    @Json(name = "zho")
    val zho: String?
) : Parcelable