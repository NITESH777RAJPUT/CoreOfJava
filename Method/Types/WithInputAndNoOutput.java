public class WithInputAndNoOutput {
    public static void main(String[] args) {
        greet("Alice"); // Calling the greet function with an argument
    }

    public static void greet(String name) { // Function with an input parameter and no return value
        System.out.println("Hello, " + name + ", welcome to the program!"); // Prints a personalized greeting message
    }
}