package bubblesort;

import java.util.Scanner;

/**
 *
 * @author Aman Singh
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[8];
        acceptSet(arr);
        printSet(arr);
        bubblesort(arr);
        printSet(arr);
    }

    public static void bubblesort(int[] a) {
        int i;
        int j;
        //loop for controling total number of passes
        for (i = 1; i < a.length; i++) {
            //loop for controling number of
            //comparison during each pass
            for (j = 0; j < (a.length - i); j++) {
                if (a[j] > a[j + 1]) {
                    //swap two elements at (j)th and (j+1)th position
                    swap(a, j, j + 1);
                }
            }//end of inner j loop
        }//end of outer i loop
        return;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return;
    }

    public static void acceptSet(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Please Enter the value of the " + (i + 1) + " element : ");
            Scanner input = new Scanner(System.in);
            a[i] = input.nextInt();
        }
    }

    public static void printSet(int[] a) {
        System.out.println("Elements in the Array are :");
        for (int element : a) {
            System.out.print(element + " ,");
        }
        System.out.println();
    }

    public static void optimizedBubbleSort(int[] a) {
        int i;
        int j;
        boolean swapped = false;
        //loop for controling total number of passes
        for (i = 1; i < a.length; i++) {
            swapped = false; //reset after each swap
            //loop for controling total number of swap
            //during each pass
            for (j = 0; j < (a.length - i); j++) {
                if (a[j] > a[j + 1]) {
                    swapped = true; //if swap is done in any pass
                    swap(a, j, j + 1);
                }
            }//end of inner j for loop
            if (swapped == false) {
                break;  //if no swap is done in any pass
                        //means array is already sorted
            }
        }//end of outer i for loop
    }

}
