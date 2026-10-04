import java.util.Arrays;

/** Useful static methods from java.util.Arrays. */
public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = { 40, 10, 30, 20 };

        // toString() gives a readable representation; printing the array
        // variable directly does not print its contents.
        System.out.println("Before sort: " + Arrays.toString(numbers));

        // Sorts the array in place (the same array is changed).
        Arrays.sort(numbers);
        System.out.println("After sort:  " + Arrays.toString(numbers));

        // Binary search requires the array to be sorted first.
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("30 found at index: " + index);

        // fill() assigns one value to every element.
        int[] defaults = new int[4];
        Arrays.fill(defaults, -1);
        System.out.println("Filled: " + Arrays.toString(defaults));

        // equals() compares contents. == compares whether references are same.
        int[] other = { 10, 20, 30, 40 };
        System.out.println("Same contents: " + Arrays.equals(numbers, other));
        System.out.println("Same object: " + (numbers == other));

        // copyOfRange uses a start-inclusive, end-exclusive range.
        int[] middle = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("Range [1, 3): " + Arrays.toString(middle));
    }
}
