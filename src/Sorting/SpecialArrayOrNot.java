package Sorting;

import java.util.Arrays;
public class SpecialArrayOrNot {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        int x = 1;
        while (index < nums.length) {
            if (nums[index] >= x) {
                int numsOfElements = nums.length - index;
                if (numsOfElements == x) {
                    return x;
                } else {
                    x++;
                }
            } else {
                index++;
            }
        }
        return -1;
    }
}
