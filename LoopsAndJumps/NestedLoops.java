/** Nested loops and simple patterns. */
public class NestedLoops {
    public static void main(String[] args) {
        // The inner loop completes all its iterations for each outer iteration.
        for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 4; column++) {
                System.out.print("(" + row + "," + column + ") ");
            }
            System.out.println();
        }

        // Triangle pattern: inner-loop limit depends on the outer-loop value.
        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
