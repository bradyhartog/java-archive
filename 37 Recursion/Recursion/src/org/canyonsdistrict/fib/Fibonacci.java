package org.canyonsdistrict.fib;

public class Fibonacci {
    public long recursiveFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            //System.out.println("Done with recursiveFib: n = " + n);
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }

    public long loopFib(int n) {
        return fib(n);
    }

    private long fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            long oldValue = 1;
            long newValue = 1;
            long olderValue = 1;
            for (int i = 3; i <= n; i++) {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            return newValue;
        }
    }
}