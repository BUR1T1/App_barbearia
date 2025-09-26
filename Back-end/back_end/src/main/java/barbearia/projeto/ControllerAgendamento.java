package barbearia.projeto;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
@CrossOrigin(origins = "*")
public class ControllerAgendamento {

    private final AgendamentoService service;
    public ControllerAgendamento(AgendamentoService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<Agendamento> criar(@RequestBody Agendamento ag) {
        Agendamento salvo = service.criar(ag);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Agendamento>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }


}
