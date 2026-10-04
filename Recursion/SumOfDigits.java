/** Add the decimal digits of a non-negative integer recursively. */
public class SumOfDigits {
    static int sumDigits(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be non-negative");
        }

        // Base case: a single digit (including zero) is its own digit sum.
        if (number < 10) {
            return number;
        }

        // number % 10 extracts the last digit; / 10 removes that digit.
        return (number % 10) + sumDigits(number / 10);
    }

    public static void main(String[] args) {
        int number = 4729;
        System.out.println("Digit sum of " + number + " = " + sumDigits(number));
    }
}
