package com.artemdev.mocks_exceptions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {

    private int a;
    private int b;
    private int expected;

    public CalculatorTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {1, 2, 3},
                {-1, -6, -7},
                {0, 0, 0}
        };
    }

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        int actual = calculator.sum(a, b);
        assertEquals(expected, actual);
    }
}
