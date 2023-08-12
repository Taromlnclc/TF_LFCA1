package com.example.tf_lfca.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tf_lfca.data.local.entities.PlantaEntity
import com.example.tf_lfca.domain.model.Planta

@Dao
interface PlantaDao {

    @Query("SELECT * FROM planta_tabla ORDER BY nombre DESC")
    suspend fun getAllPlantas(): List<PlantaEntity>

    @Query("SELECT * FROM planta_tabla WHERE id=:id")
    suspend fun getPlantaById(id: Int): List<Planta>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(planta:List<PlantaEntity>)

    @Query("DELETE FROM planta_tabla")
    suspend fun deleteAll()
}