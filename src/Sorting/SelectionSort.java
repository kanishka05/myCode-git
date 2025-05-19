package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
    }
    private static void selection(int[] arr) {
        for (int i = arr.length-1; i > 0; i --) {
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j<= i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int currentIndex, int maxIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
