package com.danielhh.rabbitMQ;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class RabbitConsumer {

    @Bean
    public Consumer<String> processMessage() {
        return message -> System.out.println("Mensaje recibido: " + message);
    }
}
