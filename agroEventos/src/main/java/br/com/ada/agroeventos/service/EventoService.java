package br.com.ada.agroeventos.service;

import br.com.ada.agroeventos.dto.EventoDTO;
import br.com.ada.agroeventos.exception.EventoNaoEncontradoException;
import br.com.ada.agroeventos.model.Evento;
import br.com.ada.agroeventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventoService {

    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public EventoDTO buscarEvento(UUID id) {
        Evento evento = eventoRepository.findById(id).orElseThrow(EventoNaoEncontradoException::new);
        EventoDTO eventoDTO = new EventoDTO(evento);
        return eventoDTO;
    }

    public Evento criarEvento(EventoDTO eventoDTO) {
        return eventoRepository.save(new Evento(eventoDTO));
    }
}
