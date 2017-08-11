package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetsNumbersTest {

    @Test
    public void testSumOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(917);
        assertEquals("Sum of digits (917) = ", 17, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountOfDigits() {
        GetsNumbers getsNumbers = new GetsNumbers();
        int result = getsNumbers.sumOdDigits(2222);
    }


}
