package com.example.barbearia

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


abstract class DataBase : RoomDatabase() {
    abstract fun agendamentoDao(): CRUD_DAO

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null

        fun getDatabase(context: Context): DataBase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "agendamento_database"
                ).build().also { INSTANCE = it }
            }
        }
    }
}