package barbearia.projeto;

import jakarta.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cliente;
    private String barbeiro;
    private String horario; // string simples; em produção use LocalDateTime

    public Agendamento() {}

    public Agendamento(String cliente, String barbeiro, String horario) {
        this.cliente = cliente;
        this.barbeiro = barbeiro;
        this.horario = horario;
    }

    public void setId(Integer id) {
    }

    // getters e setters
    // ...
}

