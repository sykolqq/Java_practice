package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator = new Calculator();

    public void testSum() {
        AssertEqualsSum(2, 2, 4);
        AssertEqualsSum(5, 4, 9);

    }

    public void testSub() {
        AssertEqualsSub(2, 2, 0);
        AssertEqualsSub(5, 4, 1);
    }


    public void testDiv() {
        AssertEqualsDiv(2, 2, 1.0);
        AssertEqualsDiv(5, 4, 1.25);
        AssertEqualsDiv(5, 0, Double.POSITIVE_INFINITY);
    }

    public void testMulti() {
        AssertEqualsMulti(2, 2, 4);
        AssertEqualsMulti(5, 5, 25);
    }

    // subTests
    private void AssertEqualsSum(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculator.sum(a, b));
    }

    private void AssertEqualsSub(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculator.sub(a, b));
    }

    private void AssertEqualsDiv(Integer a, Integer b, Double expected) {
        assertEquals(expected, calculator.div(a, b));
    }

    private void AssertEqualsMulti(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculator.multi(a, b));
    }
}