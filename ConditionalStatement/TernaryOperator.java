/** The conditional (ternary) operator is a compact value-producing choice. */
public class TernaryOperator {
    public static void main(String[] args) {
        int first = 18;
        int second = 25;

        // Syntax: condition ? valueWhenTrue : valueWhenFalse
        int larger = (first > second) ? first : second;
        System.out.println("Larger value: " + larger);

        int age = 16;
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println(status);

        // Ternary expressions can be nested, but too many nested choices make
        // code difficult to read; use if-else for complicated decisions.
        int score = 72;
        String result = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Retry";
        System.out.println(result);
    }
}
