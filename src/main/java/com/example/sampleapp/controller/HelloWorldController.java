package com.example.sampleapp.controller;

import com.example.sampleapp.model.KeyValue;
import com.example.sampleapp.repository.KeyValueRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author walid.sewaify
 * @since 13-Nov-20
 */
@RestController
@RequestMapping("/welcome")
public class HelloWorldController {
    private final KeyValueRepository repository;

    public HelloWorldController(KeyValueRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String sayHello() {
        Optional<KeyValue> message = repository.findById("message");
        if (message.isPresent()) {
            return message.get().getValue();
        }
        return "Hello!";
    }
}
