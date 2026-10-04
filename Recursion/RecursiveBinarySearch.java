/** Recursive binary search. The input array must already be sorted ascending. */
public class RecursiveBinarySearch {
    static int binarySearch(int[] sorted, int target, int low, int high) {
        // Empty search range means target is absent.
        if (low > high) {
            return -1;
        }

        // low + (high - low) / 2 avoids possible overflow in low + high.
        int middle = low + (high - low) / 2;
        if (sorted[middle] == target) {
            return middle;
        }
        if (target < sorted[middle]) {
            return binarySearch(sorted, target, low, middle - 1);
        }
        return binarySearch(sorted, target, middle + 1, high);
    }

    public static void main(String[] args) {
        int[] sortedNumbers = { 2, 5, 8, 12, 16, 23, 38 };
        int target = 16;
        int index = binarySearch(sortedNumbers, target, 0, sortedNumbers.length - 1);
        System.out.println(target + " found at index " + index);
    }
}
