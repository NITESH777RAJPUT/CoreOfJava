/** Recursive array traversal and searching. */
public class ArrayRecursion {
    static int sum(int[] values, int index) {
        // Base case: all elements from index 0 through length - 1 were handled.
        if (index == values.length) {
            return 0;
        }
        // Add the current element to the sum of the remaining elements.
        return values[index] + sum(values, index + 1);
    }

    static int linearSearch(int[] values, int target, int index) {
        // Reaching the end means the target does not occur in the array.
        if (index == values.length) {
            return -1;
        }
        if (values[index] == target) {
            return index;
        }
        return linearSearch(values, target, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 7, 2, 9, 7 };
        System.out.println("Sum: " + sum(numbers, 0));
        System.out.println("First 7 at index: " + linearSearch(numbers, 7, 0));
        System.out.println("Missing value: " + linearSearch(numbers, 5, 0));
    }
}
