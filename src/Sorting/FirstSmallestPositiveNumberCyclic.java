package Sorting;

import java.util.Arrays;

public class FirstSmallestPositiveNumberCyclic {
    public static void main(String[] args) {
        int[] arr = //{3,4,-1,1};
                {1,2,3,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                System.out.println(i+1);
                break;
            } else {
                System.out.println(arr.length + 1);
                break;
            }
        }
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] != i+1 && arr[i] > 0 && arr[i] != arr[correctIndex]) {
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
