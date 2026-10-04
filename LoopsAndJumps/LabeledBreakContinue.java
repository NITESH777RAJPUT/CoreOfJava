/** Labeled break and continue for nested loops. Use labels sparingly. */
public class LabeledBreakContinue {
    public static void main(String[] args) {
        // The label names the outer loop. This break exits both loop levels.
        search:
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                if (row == 1 && column == 2) {
                    System.out.println("Found at " + row + "," + column);
                    break search;
                }
            }
        }

        // A labeled continue skips to the next iteration of the named outer
        // loop, even when reached from inside an inner loop.
        rows:
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (column == 1) {
                    continue rows;
                }
                System.out.println("Visited " + row + "," + column);
            }
        }
    }
}
