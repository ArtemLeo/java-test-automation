package com.artemdev.mocks_exceptions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineTest {
    @Test
    public void getPowerReturnsEnginePower() {
        final Engine engine = new Engine(100);
        final int expectedPower = 100;
        final int actualPower = engine.getPower();
        assertEquals(expectedPower,actualPower);
    }
}
