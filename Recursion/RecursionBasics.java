/**
 * Recursion basics: a method solves a problem by calling itself on a smaller
 * input. Every recursive method needs a base case to stop the calls.
 */
public class RecursionBasics {
    static void countDown(int number) {
        // Base case: stop when there is nothing left to count down.
        if (number <= 0) {
            System.out.println("Done");
            return;
        }

        System.out.println(number);
        // Recursive case: make progress toward the base case.
        countDown(number - 1);
    }

    public static void main(String[] args) {
        countDown(5);
    }
}
