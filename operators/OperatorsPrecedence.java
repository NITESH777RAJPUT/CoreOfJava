public class OperatorsPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Demonstrating operator precedence
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result1); // Expected: 20

        int result2 = (a + b) * c; // Parentheses change the order of operations
        System.out.println("Result of (a + b) * c: " + result2); // Expected: 30

        int result3 = a / b + c; // Division has higher precedence than addition
        System.out.println("Result of a / b + c: " + result3); // Expected: 4

        int result4 = a / (b + c); // Parentheses change the order of operations
        System.out.println("Result of a / (b + c): " + result4); // Expected: 2
    }
}