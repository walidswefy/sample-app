package com.example.sampleapp;

import com.example.sampleapp.exntensions.TestDataExtension;
import com.example.sampleapp.repository.KeyValueRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

/**
 * @author walid.sewaify
 * @since 13-Nov-20
 */
@SpringBootTest
@ExtendWith({SpringExtension.class, TestDataExtension.class})
class SampleAppApplicationTests {
    @Autowired
    private KeyValueRepository keyValueRepository;

    @Test
    void contextLoads() throws IOException {
        System.out.println(keyValueRepository.findAll());
    }

}
