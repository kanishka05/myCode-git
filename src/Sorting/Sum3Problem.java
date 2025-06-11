package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Problem {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i< nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> sumZeroTriplet = new ArrayList<>();
                    sumZeroTriplet.add(nums[i]);
                    sumZeroTriplet.add(nums[left]);
                    sumZeroTriplet.add(nums[right]);
                    finalList.add(sumZeroTriplet);
                    // skip duplicate left and right values
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left ++;
                    right --;
                } else if (sum < 0) {
                    left ++;
                } else {
                    right --;
                }
            }

        }
    return finalList;
    }
}
