public class ChainingFunction {
    public static void main(String[] args) {
        a();
        
    }
    static void a() {
        System.out.println("Inside method a");
        b(); // Calling method b from method a
        System.out.println("Back to method a");
    }

    static void b() {
        System.out.println("Inside method b");
        c(); // Calling method c from method b
        System.out.println("Back to method b");
    }

    static void c() {
        System.out.println("Inside method c");
        System.out.println("Back to method c");
    }

    // In this example, we have three methods: a(), b(), and c(). Method a() calls method b(), and method b() calls method c(). This is an example of function chaining, where one function calls another function in a sequence. When the program is executed, it will print the following output:
    // Inside method a
    // Inside method b
    // Inside method c

}