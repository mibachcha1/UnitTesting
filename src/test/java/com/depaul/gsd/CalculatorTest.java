package com.depaul.gsd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

//Static import helps to use assert methods directly, instead of e.g. Assert.assertEquals()
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

//  The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

//  A method annotated with @Test defines a test method
//  @DisplayName can be used to define the name of the test which is displayed to the user
    @Test
    @DisplayName("Simple multiplication should work")
//    @Disabled("The method changed - Fix later")  //marks a test to be disabled.
    void multiply() {

//      This is an assert statement which validates that expected and actual value is the same, if not the message at the end of the method is shown
        assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");

    }

//  @RepeatedTest defines that this test method will be executed multiple times, in this example 5 times
    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {

//        Skip the test if executed on Windows.
//        Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));

        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }

}