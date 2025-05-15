package BasicsAndBinarySearch;

class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while (start <= end) {
            mid = (start+end)/2;
            if (target > nums[mid]) {
                start = mid + 1;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
            return -1;
    }
}