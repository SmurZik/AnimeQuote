package com.smurzik.data

import com.google.gson.annotations.SerializedName

data class AnimeQuoteCloud(
    @SerializedName("data")
    val data: Content
)

data class Content(
    @SerializedName("content")
    val quote: String
)