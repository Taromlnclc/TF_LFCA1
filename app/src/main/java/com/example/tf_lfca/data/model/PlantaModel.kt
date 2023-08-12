package com.example.tf_lfca.data.model

import com.google.gson.annotations.SerializedName

data class PlantaModel (
    @SerializedName("id") val id : Int,
    @SerializedName("nombre") val nombre : String,
    @SerializedName("tipo") val tipo : String,
    @SerializedName("imagen") val imagen : String,
    @SerializedName("descripcion") val descripcion : String
)