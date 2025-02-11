package com.danielhh.rabbitMQ;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Component
public class RabbitConsumer {

    @Bean
    public Consumer<String> processMessage() {
        System.out.println("Entra en el metodo processMessage");
        return message -> System.out.println("Mensaje recibido: " + message);
    }
}
