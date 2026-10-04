/** Check whether a string reads the same from left to right and right to left. */
public class Palindrome {
    static boolean isPalindrome(String text, int left, int right) {
        // When the indexes meet or cross, every pair matched.
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        // Compare the next pair moving inward.
        return isPalindrome(text, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "level";
        boolean result = isPalindrome(word, 0, word.length() - 1);
        System.out.println(word + " is palindrome: " + result);
    }
}
