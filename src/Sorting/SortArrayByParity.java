package Sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                swap(nums, i, startIndex);
                startIndex++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
