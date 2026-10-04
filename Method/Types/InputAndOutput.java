public class InputAndOutput {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b); // a and b are arguments 
        System.out.println("Sum: " + sum);
    }

    public static int add(int x, int y) { // x and y are parameters and it takes two integers as input and returns their sum from the function
        return x + y; // return statement is used to return the value of x + y from the function
    }
}