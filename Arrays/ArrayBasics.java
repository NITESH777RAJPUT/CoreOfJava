/**
 * Core Java arrays: declaration, creation, initialization and basic properties.
 * Run: javac ArrayBasics.java && java ArrayBasics
 */
public class ArrayBasics {
    public static void main(String[] args) {
        // Declaration only: no array object has been created yet.
        int[] scores;

        // Create an int array of length 5. Java fills every element with 0.
        scores = new int[5];

        // Declaration and creation can also be written on one line.
        String[] names = new String[3]; // reference elements default to null
        boolean[] flags = new boolean[2]; // boolean elements default to false

        // Array initializer: Java infers the length from the supplied values.
        int[] marks = { 82, 91, 76, 88 };
        String[] subjects = { "Java", "Math", "Science" };

        // Indexes start at 0 and end at length - 1.
        scores[0] = 95;
        scores[1] = 87;
        names[0] = "Asha";

        System.out.println("First mark: " + marks[0]);
        System.out.println("Number of marks: " + marks.length);
        System.out.println("Default score at index 4: " + scores[4]);
        System.out.println("Default name at index 1: " + names[1]);

        // Accessing marks[marks.length] would throw ArrayIndexOutOfBoundsException.
        // Use a valid index from 0 through marks.length - 1.
        System.out.println("Last mark: " + marks[marks.length - 1]);
    }
}
