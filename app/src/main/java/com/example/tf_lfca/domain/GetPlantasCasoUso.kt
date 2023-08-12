package com.example.tf_lfca.domain

import com.example.tf_lfca.data.PlantaRepositorio
import com.example.tf_lfca.data.local.entities.toDatabase
import com.example.tf_lfca.domain.model.Planta
import javax.inject.Inject

class GetPlantasCasoUso @Inject constructor(private val repository: PlantaRepositorio) {

    suspend operator fun invoke():List<Planta>{
       val plantas = repository.getAllPlantasFromApi()
        return if(plantas.isNotEmpty()){
            repository.deletePlantas()
            repository.insertPlantas(plantas.map { it.toDatabase() })
            plantas
        }else{
            repository.getAllPlantasFromDatabase()
        }
    }
}