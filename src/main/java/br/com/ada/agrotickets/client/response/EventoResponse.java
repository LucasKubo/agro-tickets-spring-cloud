package br.com.ada.agrotickets.client.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class EventoResponse {
    private String nome;
    private Long quantidadeIngressos;
    private String dataEvento;
}
