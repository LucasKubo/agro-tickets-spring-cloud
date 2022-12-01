package br.com.ada.agroeventos.repository;

import br.com.ada.agroeventos.model.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EventoRepository extends CrudRepository<Evento, UUID> {

}
