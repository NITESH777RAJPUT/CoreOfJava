/** Traditional switch statement, fall-through, break and modern switch expression. */
public class SwitchStatement {
    public static void main(String[] args) {
        int day = 3;

        // Traditional switch compares one value with case labels.
        // break prevents execution from continuing into the next case.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // Multiple labels can share the same body. This traditional syntax
        // works on older Java versions as well.
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Good result");
                break;
            case 'C':
                System.out.println("Keep practicing");
                break;
            default:
                System.out.println("Check the grade");
        }

        // Switch expressions (Java 14+) return a value. Arrow cases do not
        // fall through, so break is not needed.
        String kind = switch (day) {
            case 1, 7 -> "Weekend or start of week";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid day";
        };
        System.out.println(kind);
    }
}
