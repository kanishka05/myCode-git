package BasicsAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    public static void main(String[] args) {
        //Problem statement - swap the elements at 2 given indices

        //take the array as input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array is "+ Arrays.toString(arr));

        //take the input the indices you wanna swap
        System.out.println("Enter the 2 indices you wanna swap");
        int index_1 =  scanner.nextInt();
        int index_2 = scanner.nextInt();
        swap(arr, index_1, index_2);
        System.out.println("Swapped:");
        System.out.println("Array is "+ Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
