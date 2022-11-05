package com.ocean.catsaddiction.network

import com.squareup.moshi.Json

data class CatResponse(
    @Json(name = "id") val id: String?,
    @Json(name = "created_at")  val createdAt: String?,
    @Json(name = "tags") val tags: List<String>,
    @Json(name = "url") val url: String?
)