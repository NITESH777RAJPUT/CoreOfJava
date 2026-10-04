/** Two-dimensional arrays are arrays whose elements are themselves arrays. */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        // A 2-row by 3-column rectangular array. Each cell starts at 0.
        int[][] grid = new int[2][3];
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;

        // Literal initialization is often convenient for known values.
        int[][] table = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        // Use each row's length. This also works for jagged arrays.
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.print(table[row][column] + " ");
            }
            System.out.println();
        }

        // Sum all cells using nested enhanced for loops.
        int sum = 0;
        for (int[] row : table) {
            for (int cell : row) sum += cell;
        }
        System.out.println("Total: " + sum);
    }
}
