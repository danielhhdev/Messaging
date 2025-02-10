package com.danielhh.rabbitMQ;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final StreamBridge streamBridge;

    public MessageController(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @PostMapping("/messages/{message}")
    public String sendMessage(@PathVariable String message) {
        streamBridge.send("outputChannel", message);
        return "Pedido enviado";
    }
}
