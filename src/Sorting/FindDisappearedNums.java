package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNums {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //range 1 to n cyclic sort
        int i = 0;
        while (i < nums.length) {
            int currentIndex = i;
            int correctIndex = nums[i] - 1;
            if (nums[currentIndex] != nums[correctIndex]) {
                swap(nums, currentIndex, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> ans =  new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans.add(j+1);
            }
        }
        return ans;
    }

    private static void swap(int[] nums, int currentIndex, int correctIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[currentIndex];
        nums[currentIndex] = temp;
    }
}
