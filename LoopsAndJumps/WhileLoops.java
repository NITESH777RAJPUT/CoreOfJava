/** while and do-while loops for repetition controlled by a condition. */
public class WhileLoops {
    public static void main(String[] args) {
        // A while loop checks its condition before its body. It can run zero
        // times if the condition starts out false.
        int count = 1;
        while (count <= 3) {
            System.out.println("while: " + count);
            count++; // Update the condition variable to avoid an infinite loop.
        }

        // A do-while loop checks after its body, so it always runs at least once.
        int attempt = 1;
        do {
            System.out.println("Attempt " + attempt);
            attempt++;
        } while (attempt <= 2); // Note the semicolon after the condition.

        // Use while when the number of repetitions is not known in advance.
        int value = 64;
        while (value > 1) {
            value /= 2;
        }
        System.out.println("Repeatedly halved to: " + value);
    }
}
