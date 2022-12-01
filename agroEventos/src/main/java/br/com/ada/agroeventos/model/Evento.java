package br.com.ada.agroeventos.model;

import br.com.ada.agroeventos.dto.EventoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Long quantidadeIngressos;
    private LocalDateTime dataEvento;

    public Evento(EventoDTO eventoDTO){
        this.nome = eventoDTO.getNome();
        this.quantidadeIngressos = eventoDTO.getQuantidadeIngressos();
        this.dataEvento = eventoDTO.getDataEvento();
    }
}
