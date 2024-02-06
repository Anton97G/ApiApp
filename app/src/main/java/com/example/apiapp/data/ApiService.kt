package com.example.apiapp.data

import retrofit2.http.GET

interface ApiService {


@GET("/stoic-quote")
suspend fun getQuote():QuoteResponse

}