/** Common array algorithms implemented with loops. */
public class ArrayOperations {
    public static void main(String[] args) {
        int[] values = { 3, 8, 2, 8, 5 };

        // Linear search: checks elements one by one; works on unsorted arrays.
        int target = 8;
        int foundAt = -1; // -1 means "not found" by convention.
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                foundAt = i;
                break; // Stop at the first match.
            }
        }
        System.out.println(target + " first appears at index " + foundAt);

        // Count every occurrence of a value.
        int count = 0;
        for (int value : values) {
            if (value == target) count++;
        }
        System.out.println(target + " occurs " + count + " times");

        // Reverse into a new array, leaving the original unchanged.
        int[] reversed = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            reversed[i] = values[values.length - 1 - i];
        }
        System.out.print("Reversed: ");
        for (int value : reversed) System.out.print(value + " ");
        System.out.println();

        // Swap two elements in place using a temporary variable.
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
        System.out.println("After swapping first and last: " + values[0]
                + ", " + values[values.length - 1]);
    }
}
