
public class ArithmeticOperators {

    public static void main(String[] args) {
        //Arithmetic operations in Java --> +,-,*,/,%,+=,-=,*=,/=,%=,++,--;

        int a = 10; // This line declares an integer variable 'a' and initializes it with the value 10
        int b = 5; // This line declares an integer variable 'b' and initializes it with the value 5 

        int sum = a + b;
        System.out.println("Sum: " + sum); // This line prints the value of 'sum' to the console


        int difference = a - b;
        System.out.println("Difference: " + difference); // This line prints the value of 'difference' to the console

        int product = a * b;
        System.out.println("Product: " + product); // This line prints the value of 'product' to the console


        int quotient = a / b;
        System.out.println("Quotient: " + quotient); // This line prints the value of 'quotient' to the console

        int remainder = a % b;
        System.out.println("Remainder: " + remainder); // This line prints the value of 'remainder' to the console


        int addAssign = a += b; // This line adds the value of 'b' to 'a' and assigns the result back to 'a'
        //  example: a = a + b
        System.out.println("Add and Assign: " + addAssign); // This line prints the value of 'addAssign' to the console


        int subtractAssign = a -= b; // This line subtracts the value of 'b' from 'a' and assigns the result back to 'a'
        //  example: a = a - b
        System.out.println("Subtract and Assign: " + subtractAssign); // This line prints the value of 'subtractAssign' to the console


        int multiplyAssign = a *= b; // This line multiplies the value of 'a' by 'b' and assigns the result back to 'a'
        //  example: a = a * b
        System.out.println("Multiply and Assign: " + multiplyAssign); // This line prints the value of 'multiplyAssign' to the console


        int divideAssign = a /= b; // This line divides the value of 'a' by 'b' and assigns the result back to 'a'
        //  example: a = a / b
        System.out.println("Divide and Assign: " + divideAssign); // This line prints the value of 'divideAssign' to the console


        int modAssign = a %= b; // This line calculates the remainder of 'a' divided by 'b' and assigns the result back to 'a' 
        // example: a = a % b
        System.out.println("Modulus and Assign: " + modAssign); // This line prints the value of 'modAssign' to the console


        int increment = ++a; // This line increments the value of 'a' by 1 and assigns the result back to 'a'
        //  example: a = a + 1
        System.out.println("Increment: " + increment); // This line prints the value of 'increment' to the console


        int decrement = --b; // This line decrements the value of 'b' by 1 and assigns the result back to 'b'
        //  example: b = b - 1
        System.out.println("Decrement: " + decrement); // This line prints the value of 'decrement' to the console


        int postIncrement = a++; // This line assigns the current value of 'a' to 'postIncrement' and then increments 'a' by 1
        //  example: postIncrement = a; a = a + 1
        System.out.println("Post Increment: " + postIncrement); // This line prints the value of 'postIncrement' to the console


        int postDecrement = b--; // This line assigns the current value of 'b' to 'postDecrement' and then decrements 'b' by 1
        //  example: postDecrement = b; b = b - 1
        System.out.println("Post Decrement: " + postDecrement); // This line prints the value of 'postDecrement' to the console

        


       

    }
}
