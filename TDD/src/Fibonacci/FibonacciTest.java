package Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @org.junit.jupiter.api.Test
    void TestForFibonnaciNumberForPositiveValues() {

        //Create an object of the Fibonnaci
        Fibonacci testFib = new Fibonacci();
        int actualResult = testFib.fibonacci(7);
        int expectedResult = 13;

        assertEquals(expectedResult , actualResult , "The Test must fail p333");

    }

    @org.junit.jupiter.api.Test
    void TestForFibonnaciNumberForZero(){

        //Create an object of the Fibonnaci
        Fibonacci testFib = new Fibonacci();
        int actualresult = testFib.fibonacci(0);
        int expectedresult = 0;

        assertEquals(expectedresult , actualresult , "To verify the actual value for the Fib of 0");

    }
}