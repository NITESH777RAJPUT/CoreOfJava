public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assignment operator
        a = b; // Assigns the value of b to a
        System.out.println("Assignment: " + a);

        // Add and assign operator
        a += b; // Adds the value of b to a and assigns the result back to a
        System.out.println("Add and Assign: " + a);

        // Subtract and assign operator
        a -= b; // Subtracts the value of b from a and assigns the result back to a
        System.out.println("Subtract and Assign: " + a);

        // Multiply and assign operator
        a *= b; // Multiplies the value of a by b and assigns the result back to a
        System.out.println("Multiply and Assign: " + a);

        // Divide and assign operator
        a /= b; // Divides the value of a by b and assigns the result back to a
        System.out.println("Divide and Assign: " + a);

        // Modulus and assign operator
        a %= b; // Calculates the remainder of a divided by b and assigns the result back to a
        System.out.println("Modulus and Assign: " + a);
    }
}