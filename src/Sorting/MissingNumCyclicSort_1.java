package Sorting;

import java.util.Arrays;

public class MissingNumCyclicSort_1 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1}; // {0,1,2}
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        //sort - cyclic sort - bcs range given (0, n) - here (0, 3)
        int i = 0;
        while (i < nums.length){
            int correctIndex = i;
            if (nums[i] < nums.length && nums[i] != correctIndex) {
                //swap value at current index and current index ki value ko index maante hue - value there
                int indexToSwap = nums[i];
                swap(nums, i, indexToSwap);
            } else {
                i++;
            }
        }
        System.out.println("sorted: "+ Arrays.toString(nums));
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int i, int indexToSwap) {
        int temp = nums[i];
        nums[i] =  nums[indexToSwap];
        nums[indexToSwap] = temp;
    }


    //Another simple approach
   /* public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int reqnum = 0;

        for(int i = 0; i < n; i++) {
            reqnum += nums[i];

        }

        return sum-reqnum;

    }*/
}
