package com.example.parcial11.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Partido::class), version = 4)
public abstract class RoomBD : RoomDatabase() {

    abstract fun partidoDao(): PartidoDao

    companion object {
        @Volatile
        private var INSTANCE: RoomBD? = null

        fun getDatabase(context: Context): RoomBD {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomBD::class.java,
                    "Word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}