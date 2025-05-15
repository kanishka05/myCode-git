package BasicsAndBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("size of array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements:");
        for (int i = 0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        int s = arr.length;
        for (int i =0 ; i<s; i++) {
            int temp = arr[i];
            arr[i] = arr[s-1];
            arr[s-1] = temp;
            s--;
        }
        System.out.println("Reversed:");
        System.out.println(Arrays.toString(arr));
    }
}
