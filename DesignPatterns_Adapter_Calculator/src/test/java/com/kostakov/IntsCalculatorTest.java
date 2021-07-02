package com.kostakov;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntsCalculatorTest {

    private int value1 = 2;
    private int value2 = 3;


    @Test
    public void testSum() {
        int actual = value1 + value2;
        assertTrue(actual == 5);

    }

    @Test

    public void testMult() {
        int actual = value1 * value2;
        assertTrue(actual == 6);
    }

    @Test

    public void testPow() {
        int actual = (int) Math.pow(value1, value2);
        assertTrue(actual == 8);
    }

}
