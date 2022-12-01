package br.com.ada.agroeventos.dto;

import br.com.ada.agroeventos.model.Evento;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class EventoDTO {
    private String nome;
    private Long quantidadeIngressos;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataEvento;

    public EventoDTO(Evento evento){
        this.nome = evento.getNome();
        this.quantidadeIngressos = evento.getQuantidadeIngressos();
        this.dataEvento = evento.getDataEvento();
    }
}
