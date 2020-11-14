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

    public void store(KeyValue record) {
        repository.save(record);
    }

    public String getValue(String key) {
        Optional<KeyValue> message = repository.findById(key);
        return message.map(KeyValue::getValue).orElse(null);
    }
}
