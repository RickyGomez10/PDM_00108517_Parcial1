package com.example.parcial11.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.parcial11.Database.Partido
import com.example.parcial11.Database.RoomBD
import com.example.parcial11.Repository.PartidoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PartidoViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: PartidoRepository
    val allPartidos : LiveData<List<Partido>>
    init {
        val partidoDao = RoomBD.getDatabase(application).partidoDao()
        repository = PartidoRepository(partidoDao)
        allPartidos = repository.allPartidos

    }

    fun insert(partido : Partido) = viewModelScope.launch (Dispatchers.IO){
        repository.insert(partido)
    }
}