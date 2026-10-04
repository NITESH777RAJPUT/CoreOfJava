public class NoInputAndWithOutput {
    public static void main(String[] args) {
        String greeting = greet(); // Calling the greet function and storing the returned value
        System.out.println(greeting); // Printing the returned greeting message
    }

    public static String greet() { // Function with no input parameters and a return value
        return "Hello, welcome to the program!"; // Returning a greeting message
    }
}