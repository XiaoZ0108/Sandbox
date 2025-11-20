package com.xz.rest.test.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StringServiceTest {

    private StringService service = new StringService();

    @Test
    void testExample() {
        assertEquals("Hello, World!", service.get());
    }
}
