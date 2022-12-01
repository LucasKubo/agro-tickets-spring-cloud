package br.com.ada.agrotickets.service;

import br.com.ada.agrotickets.client.EventoClient;
import br.com.ada.agrotickets.client.response.EventoResponse;
import br.com.ada.agrotickets.dto.CompraIngressoDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CompraIngressoService {

    private final EventoClient eventoClient;

    public CompraIngressoService(EventoClient eventoClient) {
        this.eventoClient = eventoClient;
    }

    public void processaCompra(CompraIngressoDTO compraIngressoDTO){

    }

    public EventoResponse buscarEvento(UUID id) {
        return eventoClient.buscarEventos(id);
    }
}
