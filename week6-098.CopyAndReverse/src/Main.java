
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        /*int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));*/

        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] copyOfArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i > -1; i--) {
            copyOfArray[i] = array[j];
            j++;
        }
        return copyOfArray;
    }
}
