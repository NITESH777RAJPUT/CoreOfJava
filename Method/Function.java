public class Function {
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

// Functions are blocks of code that perform a specific task and can be reused throughout the program. They help in organizing code, making it more readable, and reducing redundancy. In this example, the `add` function takes two integers as input parameters, adds them together, and returns the result. The `main` method calls this function with specific arguments and prints the result.