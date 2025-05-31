package Sorting;

import java.util.Arrays;

public class DuplicateAndMissingNumCyclic {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,6,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                System.out.println("dup: "+arr[i]);
                System.out.println("mis: "+(i+1));
            }
        }
    }
    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != i+1 && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }
    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
