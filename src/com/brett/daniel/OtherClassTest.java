package com.brett.daniel;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OtherClassTest {
    OtherClass other;

    @BeforeEach
    public void beforeEach() {
        other = new OtherClass();
    }

    @AfterEach
    public void afterEach() {
        other = null;
    }

    @org.junit.jupiter.api.Test
    void helloWorld() {

        assert (other.helloWorld()).equals("Hello World");
    }
}