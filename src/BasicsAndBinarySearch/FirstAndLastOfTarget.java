package BasicsAndBinarySearch;

import java.util.Arrays;

public class FirstAndLastOfTarget {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        int savedStart = start;
        int savedEnd = end;
        int savedMid = 0;
        int[] result = {-1, -1};
        result[0] = firstOccurrence(nums, target, start, end, mid);
        result[1] = lastOccurrence(nums, target, start, end, mid);
        return result;
    }

    private static int lastOccurrence(int[] nums, int target, int start, int end, int mid) {
        int ansL = -1;
        while (start <= end) {
            mid = start + (end - start)/2;

            //possibility 1 - we found the target at mid - here we will check in the left for the first occurrence and in the right for the last occurrence.
            if (nums[mid] == target) {
                ansL = mid;
                //search in right for the last occurrence
                start = mid + 1 ;
            }

            //possibility 2 - mid is greater than target - we will go to the left for search
            else if (nums[mid] > target) {
                end = mid - 1;
            }

            //possibility 3 - mid is less than target - we will go to the right for search
            else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return ansL;
    }

    private static int firstOccurrence(int[] nums, int target, int start, int end, int mid) {
        int ansF = -1;
        while (start <= end) {
            mid = start + (end - start)/2;

            //possibility 1 - we found the target at mid - here we will check in the left for the first occurrence and in the right for the last occurrence.
            if (nums[mid] == target) {
                ansF = mid;
                //search in left for the first occurrence
                end = mid - 1;
            }

            //possibility 2 - mid is greater than target - we will go to the left for search
            else if (nums[mid] > target) {
                end = mid - 1;
            }

            //possibility 3 - mid is less than target - we will go to the right for search
            else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return ansF;
    }
}
