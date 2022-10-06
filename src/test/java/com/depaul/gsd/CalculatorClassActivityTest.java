package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Test to see if the initial value is 0")
    void testValue() {
        int val = calculator.getValue();
        assertEquals(0,val);
    }

    @Test
    @DisplayName("Confirm adding 7 to the initial value")
    void addTest() {
        calculator.add(7);
        int val = calculator.getValue();
        assertEquals(7,val);
    }

    @Test
    @DisplayName("Confirm subtracting 10 from initial value")
    void subtractTest() {
        calculator.subtract(10);
        int val = calculator.getValue();
        assertEquals(-10,val);
    }

}
