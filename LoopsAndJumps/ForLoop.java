/** Counting loops, omitted for-loop parts, and enhanced for loops. */
public class ForLoop {
    public static void main(String[] args) {
        // A basic for loop has initialization, condition, update and body.
        // It prints 1 through 5; the condition is checked before each pass.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Count down by changing the update expression.
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multiple variables can be initialized/updated in a for statement.
        for (int left = 0, right = 4; left < right; left++, right--) {
            System.out.println("left=" + left + ", right=" + right);
        }

        // Enhanced for visits every element when its index is not needed.
        String[] names = { "Asha", "Ravi", "Mina" };
        for (String name : names) {
            System.out.println("Hello, " + name);
        }

        // Changing the loop variable does not replace an array element.
        // Use an indexed loop when you need to update array contents.
    }
}
