package org.canyonsdistrict.fib;

public class FibonacciTester {
    public static void main(String[] args) {
        /*
        for (int i = 1; i < 50; i++) {
            Fibonacci fib = new Fibonacci();
            long value = fib.recursiveFib(i);
            System.out.println("Fib number for (" + i + ") is " + value);
        }
        */

        for (int i = 1; i < 50; i++) {
            Fibonacci fib = new Fibonacci();
            long value = fib.loopFib(i);
            System.out.println("Fib number for (" + i + ") is " + value);
        }
    }
}