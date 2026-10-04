import java.util.Arrays;

/** Copying arrays and understanding reference assignment. */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = { 10, 20, 30 };

        // Assignment copies the reference, not the array. Both variables point
        // to the same array, so changing one is visible through the other.
        int[] alias = original;
        alias[0] = 99;
        System.out.println("original[0] after alias change: " + original[0]);

        // clone() makes a separate array for primitive elements.
        int[] cloned = original.clone();

        // Arrays.copyOf() can copy and optionally change the destination length.
        int[] larger = Arrays.copyOf(original, 5); // extra int elements are 0

        // System.arraycopy() copies a range efficiently. Arguments specify
        // source, source start, destination, destination start, number of items.
        int[] destination = new int[original.length];
        System.arraycopy(original, 0, destination, 0, original.length);

        cloned[1] = -1;
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("clone:    " + Arrays.toString(cloned));
        System.out.println("larger:   " + Arrays.toString(larger));
        System.out.println("copied:   " + Arrays.toString(destination));
    }
}
