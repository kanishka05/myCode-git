package Sorting;

import java.util.Arrays;
import java.util.HashSet;

public class IsArithmaticProgression {
    public static void main(String[] args) {
        int[] nums = {3,5,1}; //1,3,5
        System.out.println(canMakeArithmeticProgression(nums));

    }
    /*public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] - arr[i-1] != arr[i+1] - arr[i]) {
                return false;
            }
        }
        return true;
    }*/
    public static boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : arr) {
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        int dCheck = (max - min) % (arr.length - 1);
        int diff = (max - min) / (arr.length - 1);
        if (dCheck != 0) return false;
        for (int a : arr) {
            set.add(a);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(min + diff*i)) {
                return false;
            }
        }
        return true;
    }
}
