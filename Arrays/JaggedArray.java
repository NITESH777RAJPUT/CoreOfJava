/** A jagged array has rows with different lengths. */
public class JaggedArray {
    public static void main(String[] args) {
        // Create the outer array first; its row references initially are null.
        int[][] scoresByStudent = new int[3][];

        // Give each row a different length.
        scoresByStudent[0] = new int[] { 80, 90 };
        scoresByStudent[1] = new int[] { 75, 88, 92 };
        scoresByStudent[2] = new int[] { 100 };

        // Never assume every row has the same number of elements.
        for (int row = 0; row < scoresByStudent.length; row++) {
            System.out.print("Student " + (row + 1) + ": ");
            for (int score : scoresByStudent[row]) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}
