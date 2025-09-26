package barbearia.projeto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<Agendamento, Integer> {
}
