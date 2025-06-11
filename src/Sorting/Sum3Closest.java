package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Closest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];  // Initialize with first 3 elements
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // If current sum is closer, update it
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    left ++;
                } else if (sum > target) {
                    right --;
                } else {
                    left ++;
                    right --;
                }
            }
        }
        return closestSum;
    }
}
