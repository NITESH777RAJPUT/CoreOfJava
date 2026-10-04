/** Calculate factorial recursively and iteratively. */
public class Factorial {
    static long factorialRecursive(int n) {
        // Factorial is defined here only for non-negative integers.
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // 0! = 1 and 1! = 1 are base cases.
        if (n <= 1) {
            return 1;
        }

        // n! = n * (n - 1)!; each call receives a smaller value.
        return n * factorialRecursive(n - 1);
    }

    static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        long result = 1;
        for (int value = 2; value <= n; value++) {
            result *= value;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "! recursive = " + factorialRecursive(number));
        System.out.println(number + "! iterative = " + factorialIterative(number));
        // long also has a maximum value; factorial values eventually overflow.
    }
}
