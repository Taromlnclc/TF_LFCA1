package com.example.tf_lfca.data

import com.example.tf_lfca.data.local.dao.PlantaDao
import com.example.tf_lfca.data.local.entities.PlantaEntity
import com.example.tf_lfca.data.model.PlantaModel
import com.example.tf_lfca.data.remota.PlantaService
import com.example.tf_lfca.domain.model.Planta
import com.example.tf_lfca.domain.model.toDomain
import javax.inject.Inject

class PlantaRepositorio @Inject constructor(
    private val api: PlantaService,
    private val plantaDao: PlantaDao) {

    suspend fun getAllPlantasFromApi(): List<Planta> {
        val response: List<PlantaModel> = api.getPlantas()
        return response.map { it.toDomain() }
    }

    suspend fun getAllPlantasFromDatabase(): List<Planta>{
        val response: List<PlantaEntity> = plantaDao.getAllPlantas()
        return response.map { it.toDomain() }
    }

    suspend fun getPlantaByIdFromApi(id: Int): List<PlantaModel>{
        return api.getPlantaById(id)
    }
    suspend fun getPlantaByIdFromDatabase(id: Int): List<Planta>{
        return plantaDao.getPlantaById(id)
    }

    suspend fun insertPlantas(plantas: List<PlantaEntity>){
        plantaDao.insertAll(plantas)
    }

    suspend fun deletePlantas(){
        plantaDao.deleteAll()
    }
}