package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
    }
    static void bubble(int[] arr) {
        boolean swap = false;
        //how many times
        for (int i = 0; i < arr.length; i++) {
            // internal comparing in each i round
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                System.out.println("array is sorted");
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
