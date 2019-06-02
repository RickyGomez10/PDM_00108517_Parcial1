package com.example.parcial11.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Partido")
class Partido(
    @ColumnInfo(name="EquipoA")
    val EquipoA : String,

    @ColumnInfo(name="EquipoB")
    val EquipoB: String,

    @ColumnInfo(name="ScoreA")
    val ScoreA: Int,

    @ColumnInfo(name="ScoreB")
    val ScoreB : Int,

    @ColumnInfo(name = "Fecha")
    val fecha : String,
    @ColumnInfo(name="Ganador")
    val Ganador : String
){

    @PrimaryKey(autoGenerate = true)
    var Id_Partido : Int = 0

}