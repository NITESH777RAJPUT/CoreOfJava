/** Fibonacci sequence: a classic example that also shows inefficient recursion. */
public class Fibonacci {
    static long fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        // Base cases: F(0) = 0 and F(1) = 1.
        if (n <= 1) {
            return n;
        }
        // F(n) = F(n - 1) + F(n - 2).
        // This simple version recalculates many values and gets slow quickly.
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static long fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (n <= 1) return n;
        long previous = 0;
        long current = 1;
        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("F(" + n + ") recursively = " + fibonacciRecursive(n));
        System.out.println("F(" + n + ") iteratively = " + fibonacciIterative(n));
    }
}
