/** break and continue alter the normal flow through a loop. */
public class BreakContinue {
    public static void main(String[] args) {
        // break immediately exits the nearest enclosing loop.
        for (int number = 1; number <= 10; number++) {
            if (number == 5) {
                break;
            }
            System.out.print(number + " ");
        }
        System.out.println(" <- stopped by break");

        // continue skips the rest of the current iteration and checks again.
        for (int number = 1; number <= 6; number++) {
            if (number % 2 == 0) {
                continue; // Skip even values.
            }
            System.out.print(number + " ");
        }
        System.out.println(" <- odd values only");

        // break also exits a switch. In a loop containing a switch, an
        // unlabeled break exits the switch, not the surrounding loop.
    }
}
