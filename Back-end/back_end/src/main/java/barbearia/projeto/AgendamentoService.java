package barbearia.projeto;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    private final Repositorio repo;
    public AgendamentoService(Repositorio repo) { this.repo = repo; }

    public barbearia.projeto.Agendamento criar(barbearia.projeto.Agendamento a) { return repo.save(a); }
    public List<barbearia.projeto.Agendamento> listarTodos() { return repo.findAll(); }
    public Optional<barbearia.projeto.Agendamento> buscarPorId(Integer id) { return repo.findById(id); }
    public barbearia.projeto.Agendamento atualizar(Integer id, barbearia.projeto.Agendamento novo) {
        novo.setId(id);
        return repo.save(novo);
    }
    public void deletar(Integer id) { repo.deleteById(id); }
}
