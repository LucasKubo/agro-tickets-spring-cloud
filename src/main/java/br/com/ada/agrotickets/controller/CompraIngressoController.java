package br.com.ada.agrotickets.controller;

import br.com.ada.agrotickets.client.response.EventoResponse;
import br.com.ada.agrotickets.dto.CompraIngressoDTO;
import br.com.ada.agrotickets.service.CompraIngressoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/ingresso")
public class CompraIngressoController {

    private final CompraIngressoService compraIngressoSerivce;

    public CompraIngressoController(CompraIngressoService compraIngressoSerivce) {
        this.compraIngressoSerivce = compraIngressoSerivce;
    }

    @GetMapping
    public ResponseEntity<EventoResponse> buscarEvento(@RequestParam UUID id){
        return ResponseEntity.ok(compraIngressoSerivce.buscarEvento(id));
    }

    @PostMapping
    public ResponseEntity<CompraIngressoDTO> compraIngresso(CompraIngressoDTO compraIngressoDTO){

        return null;
    }
}
