package Sorting;

import java.util.Arrays;

public class SqareOfSortedArrays {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    /*public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        return nums;
    }*/
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int resultIndex = nums.length - 1;
        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                result[resultIndex] = nums[start] * nums[start];
                start++;

            } else {
                result[resultIndex] = nums[end] * nums[end];
                end--;

            }
            resultIndex--;
        }
        return result;
    }
}
