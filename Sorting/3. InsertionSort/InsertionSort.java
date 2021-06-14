package insertionsort;

/**
 *
 * @author Aman Singh
 */
public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("********* Insertion Sort *********");
        int size = 10;
        int[] arr = {12, 34, 56, 78, 3, 2, 1, 4, 5, 9};
        System.out.println("Element in the arrays Before Sorting :");
        printArray(arr, size);
        insertionSort(arr, size);
        System.out.println("Element in the arrays After Sorting :");
        printArray(arr, size);
    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("\n");
    }

    private static void insertionSort(int[] arr, int size) {
        int position;
        int currentValue;
        int index;
        for (index = 1; index < size; index++) {
            currentValue = arr[index];
            position = index;
            //comparing with all the elements before the current element
            while (position > 0 && (arr[position - 1] > currentValue)) {
                arr[position] = arr[position - 1];
                --position;
            }
            arr[position] = currentValue;
        }
    }

}
