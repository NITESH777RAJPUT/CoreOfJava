/** Compare a recursive calculation with a loop-based calculation. */
public class RecursionVsIteration {
    static int sumToRecursive(int n) {
        if (n <= 0) return 0; // Base case
        return n + sumToRecursive(n - 1); // Smaller recursive problem
    }

    static int sumToIterative(int n) {
        int sum = 0;
        for (int value = 1; value <= n; value++) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Recursive sum: " + sumToRecursive(n));
        System.out.println("Iterative sum: " + sumToIterative(n));
        // Recursion can make naturally self-similar problems clear, but each
        // call uses stack space. Very deep recursion can cause StackOverflowError.
    }
}
