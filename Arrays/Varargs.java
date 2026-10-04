/** Variable arguments are received inside a method as an array. */
public class Varargs {
    // The ... syntax lets callers pass zero or more int values.
    // A varargs parameter must be the final parameter in a method signature.
    static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) total += number;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum());             // zero values
        System.out.println(sum(4, 5));         // two values
        System.out.println(sum(1, 2, 3, 4));   // four values

        // An existing int[] can also be passed to a varargs method.
        int[] values = { 10, 20, 30 };
        System.out.println(sum(values));
    }
}
