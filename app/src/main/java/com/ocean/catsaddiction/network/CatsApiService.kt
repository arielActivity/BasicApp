package com.ocean.catsaddiction.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

const val BASE_URL = "https://cataas.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit
    .Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface CatsApiService {

    @GET("cat?json=true")
    suspend fun getPhoto(): CatResponse

}

object CatsApi {
    val retrofitService: CatsApiService by lazy { retrofit.create(CatsApiService::class.java) }
}