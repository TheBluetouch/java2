package com.sda.calc;

import static com.sda.calc.Calculator.multiplyNumbers;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void shouldMultiplyNumbersWithThreeGivenArguments() {
        //given
        int start = 2;
        int end = 10;
        int step = 3;
        int expectedResult = 80;
        //when
        int result = multiplyNumbers(start, end, step);
        //then
        assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
    void shouldMultiplyNumbersWithTwoGivenArguments() {
        //given
        int start = 5;
        int end = 8;
        int expectedResult = 210;
        //when
        int result= multiplyNumbers(start,end);
        //then
        assertEquals(expectedResult,result);
    }

    @org.junit.jupiter.api.Test
    void shouldMultiplyNumbersWithOneGivenArguments() {
        //given
        int end =5;
        int expectedResult = 24;
        //when
        int result = multiplyNumbers(end);
        //then
        assertEquals(expectedResult,result);
    }
}