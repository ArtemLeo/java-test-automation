package com.artemdev.mocks_exceptions;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class CarTest {
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    private Engine engine;

    @Test
    public void GetCopyrightTitleReturnsNameAndSign() {
        final Car car = new Car("BMW", engine);
        final String expectedCopyrightTitle = "BMW @";
        final String actualCopyrightTitle = car.getCopyrightTitle();
        assertEquals(expectedCopyrightTitle, actualCopyrightTitle);
    }

    @Test
    public void getPowerShouldReturnEnginePower() {
        Mockito.when(engine.getPower()).thenReturn(100);
        final Car car = new Car("BMW", engine);
        final int expectedSpeed = 200;
        final int actualSpeed = car.getMaxSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}
