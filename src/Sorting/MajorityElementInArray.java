package Sorting;

import java.util.Arrays;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {1};//{3,2,3};//{2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        //if I only have one element in the array
        if (nums.length == 1) {
            return nums[0];
        }
        //sort this array-using insertion sort
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int k = 0;
        int cnt = 0;
        int ans = 0;
        while (k < nums.length - 1) {
            if (nums[k] == nums[k+1]) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt + 1 == (nums.length/2)+1) {
                ans = nums[k];
                break;
            }
            k++;
        }
        return ans;
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
