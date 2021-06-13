package shellsort;

/**
 *
 * @author Aman Singh
 */
public class ShellSort {

    public static void main(String[] args) {
        System.out.println("********* Shell Sort *********");
        int size = 9;
        int[] arr = {9, 15, 6, 3, 8, 4, 12, 2, 5};
        int shell;
        if (size % 2 == 0) {
            shell = size / 2;
        } else {
            shell = (size / 2) + 1;
        }
        System.out.println("Element in the arrays Before Sorting :");
        printSet(arr, size);
        shellSort(arr, shell, size);
        System.out.println("Element in the arrays After Sorting :");
        printSet(arr, size);
    }

    public static void shellSort(int[] arr, int shell, int size) {
        while (shell != 0) {
            for (int i = 0; (i + shell) < size; i++) {
                if (arr[i] > arr[i + shell]) {
                    int temp = arr[i];
                    arr[i] = arr[i + shell];
                    arr[i + shell] = temp;
                }
            }
            shell--;
        }
    }

    public static void printSet(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.print("\n");
    }
}
