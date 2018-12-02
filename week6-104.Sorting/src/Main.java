
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        /*int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));*/

 /*int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));*/
 /*int[] values = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));

        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));*/
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        // write the code here
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int[] newArray = new int[array.length - index];
        int j = 0;
        for (int i = index; i < array.length; i++) {
            newArray[j] = array[i];
            j++;
        }

        for (int i = index; i < array.length; i++) {
            if (array[i] == smallest(newArray)) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
