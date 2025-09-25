package com.example.barbearia

import androidx.room.Entity
import androidx.room.PrimaryKey

class Tabelas {

    //Tabela de agendamento
    @Entity(tableName = "agendamentos")
    data class Agendamento(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val cliente: String,
        val barbeiro: String,
        val horario: String,
        val status: Boolean = false
    )

    //Tabela de clientes
    @Entity(tableName = "clientes")
    data class Cliente(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val nome: String,
        val email: String,
        val telefone: String
    )

    //Tabelas de barbeiros
    @Entity(tableName = "barbeiros")
    data class Barbeiro(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val nome: String,
        val especialidade: String
    )
}