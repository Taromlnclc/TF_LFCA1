package com.example.tf_lfca.data.remota

import com.example.tf_lfca.data.model.PlantaModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PlantaApiClient {
    @GET("/plantas")
    suspend fun getAllPlantas(): Response<List<PlantaModel>>

    @GET("/plantas/{id}")
    suspend fun getPlantaById(@Path("id") id: Int): Response<List<PlantaModel>>

}