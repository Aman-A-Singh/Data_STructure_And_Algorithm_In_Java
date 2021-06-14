package countingsort;

/**
 *
 * @author Aman Singh
 */
public class CountingSort {

    public static void main(String[] args) {
        System.out.println("********* Counting Sort *********");
        int size = 10;
        int[] arr = {5, 2, 5, 3, 6, 1, 5, 3, 9, 6};
        System.out.println("Element in the arrays Before Sorting :");
        printArray(arr, size);

        System.out.println("Element in the arrays After Sorting :");
        countingSort(arr, size);

    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("\n");
    }

    private static void countingSort(int[] arr, int size) {
        //Step 1: Finding the maximum element
        int maximum = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        //Step 2: Initialize a count array of length = (maximum+1)
        int[] count = new int[maximum + 1];

        //Step 3: Set the count array accordingly
        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }
        //Step 4: Calculate cumulative frequency in Count Array
        for (int i = 1; i <= maximum; i++) {
            count[i] += count[i - 1];
        }

        //Step 5: Fixed the values in the sorted array
        int sorted_arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            sorted_arr[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        printArray(sorted_arr, size);

    }
}
