package Sorting;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        //use cyclic sort bcs range of elements given i.e. 1 to n
        int i = 0;
       while (i < nums.length){
                int currentIndex = i;
                int correctIndex = nums[i] - 1;
                if (nums[currentIndex] != nums[correctIndex]) {
                    swap(nums, correctIndex, currentIndex);
                }  else {
                    i++;
                }
        }
        System.out.println(Arrays.toString(nums));
        int[] result = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                result[0] = nums[j];
                result[1] = j+1;
            }
        }
        return result;
    }

    private static void swap(int[] nums, int correctIndex, int currentIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[currentIndex];
        nums[currentIndex] = temp;
    }
}
