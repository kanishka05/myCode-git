package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbersCyclicSort {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMissingNumbers(arr));
    }

    private static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumsList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                missingNumsList.add(i+1);
            }
        }
        if (missingNumsList.isEmpty()) {
            missingNumsList.add(arr.length);
        }
        return missingNumsList;
    }

    private static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
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
