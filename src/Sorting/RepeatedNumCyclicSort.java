package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedNumCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
        /*for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != i + 1) {
                System.out.println(arr[i]);
            }
        }*/
    }
    private static void cyclicSorting(int[] arr) {
        List<Integer> dups = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != i+1) {
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    dups.add(arr[i]);
                    break;
                }
            } else {
                i++;
            }
        }
        System.out.println(dups);
    }
    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
