package com.example.sampleapp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author walid.sewaify
 * @since 13-Nov-20
 */
@SpringBootTest
class KeyValueServiceTest {
    @Autowired
    KeyValueService service;

    @Test
    void getMessage() {
        System.out.println(service.getMessage());
    }
}
