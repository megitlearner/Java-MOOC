
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        return minIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int minIndex = index;
        for (int i = minIndex; i < array.length; i++) {
            if (array[i] < minIndex) {
                //minIndex = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println("---Before Sorting---");
        System.out.println(Arrays.toString(array));
        System.out.println("---Printing each step of Sorting array--");
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println("We're at stage " + i);
            if (array[i] < min) {
                min = array[i];
                //System.out.println(Arrays.toString(array));
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        // write testcode here
        /*
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        System.out.println("indexOfTheSmallest: " + indexOfTheSmallest(values));

        System.out.println(Arrays.toString(values));

        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
         */
        //int[] values1 = {8, 3, 7, 9, 1, 2, 4};
        //sort(values1);

        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

    }

}
