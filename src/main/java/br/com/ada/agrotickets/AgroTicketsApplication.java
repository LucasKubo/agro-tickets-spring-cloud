package br.com.ada.agrotickets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AgroTicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgroTicketsApplication.class, args);
    }

}
