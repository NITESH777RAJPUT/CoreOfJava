public class FunctionOverloading {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        double d = 2.5;
        double e = 3.5;

        int sumInt = add(a, b); // Calls the method with integer 2 parameters
        int sumInt2 = add(a,b,c); // Calls the method with integer 3 parameters
        double sumDouble = add(c, d); // Calls the method with double parameters

        System.out.println("Sum of integers: " + sumInt);
        System.out.println("Sum of integers (3 params): " + sumInt2);
        System.out.println("Sum of doubles: " + sumDouble);
    }

    // Method to add two integers
    public static int add(int x, int y) {
        return x + y;
    }

    // Overloaded method to add three integers
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // Overloaded method to add two doubles
    public static double add(double x, double y) {
        return x + y;
    }

}