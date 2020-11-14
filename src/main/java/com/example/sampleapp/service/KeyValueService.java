package com.example.sampleapp.service;

import com.example.sampleapp.model.KeyValue;
import com.example.sampleapp.repository.KeyValueRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author walid.sewaify
 * @since 13-Nov-20
 */
@Service
public class KeyValueService {
    private final KeyValueRepository repository;

    public KeyValueService(KeyValueRepository repository) {
        this.repository = repository;
    }

    public void store(String key, String value) {
        KeyValue record = new KeyValue();
        record.setKey(key);
        record.setValue(value);
        repository.save(record);
    }

    public String getMessage() {
        Optional<KeyValue> message = repository.findById("message");
        if (message.isPresent()) {
            return message.get().getValue();
        }
        return "Hello!";
    }
}
