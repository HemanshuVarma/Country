package com.varma.hemanshu.country.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class NativeName(
    @Json(name = "ara")
    val ara: Ara?,
    @Json(name = "arc")
    val arc: Arc?,
    @Json(name = "aze")
    val aze: Aze?,
    @Json(name = "ben")
    val ben: Ben?,
    @Json(name = "ckb")
    val ckb: Ckb?,
    @Json(name = "div")
    val div: Div?,
    @Json(name = "dzo")
    val dzo: Dzo?,
    @Json(name = "eng")
    val eng: EngX?,
    @Json(name = "fas")
    val fas: Fas?,
    @Json(name = "fil")
    val fil: Fil?,
    @Json(name = "fra")
    val fra: FraX?,
    @Json(name = "heb")
    val heb: Heb?,
    @Json(name = "hin")
    val hin: Hin?,
    @Json(name = "hye")
    val hye: Hye?,
    @Json(name = "ind")
    val ind: Ind?,
    @Json(name = "jpn")
    val jpn: Jpn?,
    @Json(name = "kat")
    val kat: Kat?,
    @Json(name = "kaz")
    val kaz: Kaz?,
    @Json(name = "khm")
    val khm: Khm?,
    @Json(name = "kir")
    val kir: Kir?,
    @Json(name = "kor")
    val kor: Kor?,
    @Json(name = "lao")
    val lao: Lao?,
    @Json(name = "mon")
    val mon: Mon?,
    @Json(name = "msa")
    val msa: Msa?,
    @Json(name = "mya")
    val mya: Mya?,
    @Json(name = "nep")
    val nep: Nep?,
    @Json(name = "por")
    val por: Por?,
    @Json(name = "prs")
    val prs: Prs?,
    @Json(name = "pus")
    val pus: Pus?,
    @Json(name = "rus")
    val rus: Rus?,
    @Json(name = "sin")
    val sin: Sin?,
    @Json(name = "tam")
    val tam: Tam?,
    @Json(name = "tet")
    val tet: Tet?,
    @Json(name = "tgk")
    val tgk: Tgk?,
    @Json(name = "tha")
    val tha: Tha?,
    @Json(name = "tuk")
    val tuk: Tuk?,
    @Json(name = "tur")
    val tur: Tur?,
    @Json(name = "urd")
    val urd: Urd?,
    @Json(name = "uzb")
    val uzb: Uzb?,
    @Json(name = "vie")
    val vie: Vie?,
    @Json(name = "zho")
    val zho: Zho?
) : Parcelable