/** Combining conditions with relational, logical and short-circuit operators. */
public class LogicalConditions {
    public static void main(String[] args) {
        int age = 22;
        boolean hasTicket = true;
        boolean isStudent = false;

        // Relational operators: <, <=, >, >=, == and != produce booleans.
        boolean adult = age >= 18;

        // && means AND; both conditions must be true.
        if (adult && hasTicket) {
            System.out.println("May enter");
        }

        // || means OR; at least one condition must be true.
        if (isStudent || age < 25) {
            System.out.println("Eligible for the youth offer");
        }

        // ! reverses a boolean value.
        if (!hasTicket) {
            System.out.println("Buy a ticket first");
        }

        // Short-circuiting: the second part of && is skipped if the first is
        // false. This safely avoids accessing an invalid array index.
        int[] values = { 10, 20 };
        int index = 5;
        if (index >= 0 && index < values.length && values[index] > 0) {
            System.out.println("Selected value is positive");
        } else {
            System.out.println("Index is outside the array");
        }

        // For objects such as String, use equals() for text comparison.
        String input = "yes";
        if (input.equals("yes")) {
            System.out.println("Confirmed");
        }
    }
}
