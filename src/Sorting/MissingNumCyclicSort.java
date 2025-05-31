package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumCyclicSort {
    public static void main(String[] args) {
         int[] arr = //{4, 3, 2, 7, 8, 2, 3, 1};
                 //{3, 0, 1};
                 {0,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number is: "+findMissing(arr));

    }

    private static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) {
                int currentIndex = i;
                int correctIndex = arr[i];
                swap(arr, currentIndex, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int currentIndex, int correctIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
