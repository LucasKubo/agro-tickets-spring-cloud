package br.com.ada.agrotickets.client;

import br.com.ada.agrotickets.client.response.EventoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;


@FeignClient(name = "eventos", url = "http://localhost:8081")
public interface EventoClient {

    @GetMapping("/eventos?id={id}")
    EventoResponse buscarEventos(@RequestParam UUID id);
}
