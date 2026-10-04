/** Core conditional statements: if, if-else, else-if and nested if. */
public class IfElse {
    public static void main(String[] args) {
        int temperature = 28;

        // A simple if runs its body only when the condition is true.
        if (temperature > 25) {
            System.out.println("It is warm.");
        }

        // Exactly one branch in an if-else statement is selected.
        int number = -7;
        if (number >= 0) {
            System.out.println("Non-negative");
        } else {
            System.out.println("Negative");
        }

        // else-if is useful when several mutually exclusive cases are tested.
        int score = 84;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Needs improvement");
        }

        // Order conditions from most specific to least specific when needed.
        int age = 20;
        boolean hasId = true;
        if (age >= 18) {
            if (hasId) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("Please show your ID");
            }
        } else {
            System.out.println("Entry not allowed");
        }
    }
}
