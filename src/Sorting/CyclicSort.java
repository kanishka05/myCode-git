package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i+1) {
                int currentIndex = i;
                int correctIndex = arr[i] - 1;
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
