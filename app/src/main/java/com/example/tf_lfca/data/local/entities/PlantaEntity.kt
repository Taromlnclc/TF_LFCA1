package com.example.tf_lfca.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.example.tf_lfca.domain.model.Planta

@Entity(tableName="planta_tabla")
data class PlantaEntity (
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "tipo") val tipo: String,
    @ColumnInfo(name = "imagen") val imagen: String,
    @ColumnInfo(name = "descripcion") val descripcion: String
)

fun Planta.toDatabase() = PlantaEntity(id = id, nombre = nombre, tipo = tipo, imagen = imagen, descripcion = descripcion)