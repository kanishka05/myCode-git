package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicateNumbersCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> dups = new ArrayList<>();
        sortCyclic(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=0; i< arr.length; i++) {
            if (arr[i] != i+1) {
                dups.add(arr[i]);
            }
        }
        System.out.println(dups);
    }

    private static void sortCyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != i+1 && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
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
