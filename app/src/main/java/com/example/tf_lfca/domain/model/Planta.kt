package com.example.tf_lfca.domain.model

import com.example.tf_lfca.data.local.entities.PlantaEntity
import com.example.tf_lfca.data.model.PlantaModel


data class Planta (val id:Int, val nombre:String,val tipo:String,val imagen:String,val descripcion:String)

fun PlantaEntity.toDomain() = Planta(id, nombre, tipo, imagen, descripcion)
fun PlantaModel.toDomain() = Planta(id, nombre, tipo, imagen, descripcion)