package BasicsAndBinarySearch;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
                    //{1,3};
                    //{5,7,7,8,8,10};
                    //{5,7,7,8,8,10};
        int target = 8;
                    //1;
                    //6;
                    //8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length < 1) {
            return result;
        }
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start)/2;
            if (nums[mid] > target) end = mid - 1;
            else if (nums[mid] < target) start = mid + 1;
            else {
                //meaning we have found the target at mid
                //now the first occurrence can be this, or in it's left
                //and the last occurrence can be this, or it's right
               if (nums[start] == target) {
                   result[0] = start;
               } else if (nums[start] < target) {
                   start = start + 1;
               }
                if (nums[end] == target) {
                    result[1] = end;
                } else if (nums[end] > target) {
                    end = end - 1;
                }
            }
            if (result[0] != -1 && result[1] != -1) {
                break; //  break the loop once both start and end are found
            }
        }

        return result;
    }
}
