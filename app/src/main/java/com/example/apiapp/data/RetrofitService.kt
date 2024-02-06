package com.example.apiapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private const val BASE_URL = " https://stoic.tekloon.net"

    private val retrofit:Retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
    val apiService:ApiService = retrofit.create(ApiService::class.java)
}