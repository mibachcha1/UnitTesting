package com.depaul.gsd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

//Static import helps to use assert methods directly, instead of e.g. Assert.assertEquals()
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestParam {

    Calculator calculator;

    //  The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    //=========================Parameterized Tests=============================
    public static int[][] data() {
        return new int[][] { { 2 , 3, 6 }, { 7, 8, 56 }, { 110, 7, 770 } };
    }

    @ParameterizedTest
    @MethodSource(value =  "data")
    void testWithStringParameter(int[] data) {
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        assertEquals(expected, calculator.multiply(m1, m2));
    }
}