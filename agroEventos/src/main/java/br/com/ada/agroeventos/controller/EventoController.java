package br.com.ada.agroeventos.controller;

import br.com.ada.agroeventos.dto.EventoDTO;
import br.com.ada.agroeventos.model.Evento;
import br.com.ada.agroeventos.service.EventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping
    public ResponseEntity<Evento> criarEvento(@RequestBody EventoDTO eventoDTO){
        return ResponseEntity.ok(eventoService.criarEvento(eventoDTO));
    }

    @GetMapping
    public ResponseEntity<EventoDTO> buscarEvento(@RequestParam UUID id){
        return ResponseEntity.ok(eventoService.buscarEvento(id));
    }
}
