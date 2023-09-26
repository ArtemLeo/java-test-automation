package com.artemdev.mocks_exceptions;

import org.junit.Test;

public class CalculatorExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void divisionWithZeroThrowsException() {
        Calculator calculator = new Calculator();
        calculator.division(5, 0);
    }
}
