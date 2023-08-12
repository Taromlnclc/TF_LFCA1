package com.example.tf_lfca.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tf_lfca.data.local.dao.PlantaDao
import com.example.tf_lfca.data.local.entities.PlantaEntity

@Database(entities = [PlantaEntity::class], version = 1)
abstract class PlantaDatabase: RoomDatabase() {
    abstract fun getPlantaDao():PlantaDao
}