package com.example.parcial11.Repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.parcial11.Database.Partido
import com.example.parcial11.Database.PartidoDao

class PartidoRepository(private val partidoDao: PartidoDao) {
    val allPartidos : LiveData<List<Partido>> = partidoDao.getAllPartidos()

    @WorkerThread
    suspend fun insert(partido : Partido){
        partidoDao.insert(partido)
    }
}