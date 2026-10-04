/** Different safe ways to visit each element in a one-dimensional array. */
public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = { 12, 7, 25, 4, 18 };

        // Classic for loop: use the index when you need position information.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Enhanced for loop: concise when only the values are needed.
        for (int number : numbers) {
            System.out.println("Value: " + number);
        }

        // Calculate sum and average. Use double for a fractional average.
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Find minimum and maximum. Start from an actual array value rather
        // than assuming all values are positive or negative.
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.println("Minimum: " + min + ", maximum: " + max);
    }
}
