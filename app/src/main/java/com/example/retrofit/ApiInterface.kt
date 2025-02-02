package com.example.retrofit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiInterface {
    @GET("end/point")
    fun getExampleData(): Call<ExampleResponse>
}