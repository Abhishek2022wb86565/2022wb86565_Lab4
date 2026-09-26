package com.bits.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    void testMessage() {
        String expected = "Hello, DevOps Lab - CI Triggered!";
        String actual = "Hello, DevOps Lab - CI Triggered!";
        assertEquals(expected, actual);
    }
}
