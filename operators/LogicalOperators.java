public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b; // false
        System.out.println("Logical AND: " + andResult);

        // Logical OR
        boolean orResult = a || b; // true
        System.out.println("Logical OR: " + orResult);

        // Logical NOT
        boolean notResult = !a; // false
        System.out.println("Logical NOT: " + notResult);
    }
}