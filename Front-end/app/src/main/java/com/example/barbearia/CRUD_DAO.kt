package com.example.barbearia

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

class CRUD_DAO {

    interface agendamento{

        @Insert
        suspend fun inserirAgendamento(agendamento: Tabelas.Agendamento)

        @Query("SELECT * FROM agendamentos")
        suspend fun listarAgendamentos(): List<Tabelas.Agendamento>

        @Update
        suspend fun atualizarAgendamento(agendamento: Tabelas.Agendamento)

        @Delete
        suspend fun deletarAgendamento(agendamento: Tabelas.Agendamento)

    }
}