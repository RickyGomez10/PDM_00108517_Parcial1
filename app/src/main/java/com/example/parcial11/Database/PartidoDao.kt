package com.example.parcial11.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PartidoDao {
    @Query("Select * from Partido order by Id_Partido desc")
    fun getAllPartidos() : LiveData<List<Partido>>

    @Insert
    suspend fun insert(partido : Partido)
}