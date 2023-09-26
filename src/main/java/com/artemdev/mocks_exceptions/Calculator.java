package com.artemdev.mocks_exceptions;

// Написать параметризованный тест на метод sum
// Написать тест, проверяющий исключение, на метод division

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double division(int a, int b) {
        return a / b;
    }
}
