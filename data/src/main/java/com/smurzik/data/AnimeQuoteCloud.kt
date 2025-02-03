package com.smurzik.data

import com.google.gson.annotations.SerializedName

data class AnimeQuoteCloud(
    @SerializedName("content")
    val quote: String
)