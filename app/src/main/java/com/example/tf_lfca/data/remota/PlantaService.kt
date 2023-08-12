package com.example.tf_lfca.data.remota

import com.example.tf_lfca.data.model.PlantaModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PlantaService @Inject constructor(private val api:PlantaApiClient) {
    suspend fun getPlantas(): List<PlantaModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllPlantas()
            response.body() ?: emptyList()
        }
    }

    suspend fun getPlantaById(id: Int):List<PlantaModel>{
        return withContext(Dispatchers.IO) {
            val response = api.getPlantaById(id)
            response.body() ?: emptyList()
        }
    }
}