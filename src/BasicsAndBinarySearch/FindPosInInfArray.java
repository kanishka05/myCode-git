package BasicsAndBinarySearch;

import java.util.Arrays;

public class FindPosInInfArray {
    public static void main(String[] args) {
        //assume you have given infinite array - meaning we don't know the length.
        int[] arr = {3,5,7,9,13,14,15};
        //given a target
        int target = 13;
        int[] range = new int[2];

        int[] r = findTheRange(arr, target, range);
        if (r[0] != -1) {
            //apply binary search here
           int index = binarySearch(arr, target, r[0], r[1]);
            if (index != -1) {
                System.out.println(target + " found at index: " + index);
            } else {
                System.out.println("Target not found in the range");
            }
        } else {
            System.out.println("Target is outside array bounds");
        }
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = (s+e)/2;
            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    private static int[] findTheRange(int[] arr, int target, int[] range) {
        int start = 0;
        int end =  1;
        try {
            while (target > arr[end]) {
                int newStart = end + 1;
                end = end + ((end-start)+1)*2;
                start = newStart;
            }
        } catch (Exception e) {
            range[0] = -1;
            range[1] = -1;
            return range;
        }

        System.out.println("found the range");
        range[0] = start;
        range[1] = end;
        System.out.println(Arrays.toString(range));
        return range;
        }
}
