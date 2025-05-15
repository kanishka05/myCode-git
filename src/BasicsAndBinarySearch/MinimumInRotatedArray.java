package BasicsAndBinarySearch;

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = //{3,4,5,1,2};
                //{4,5,6,7,0,1,2};
                {11,13,15,17};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int minNum = -1;
        if (nums.length == 1) {
            return nums[0];
        }

        //first we will find out the index where the array was rotated.
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int rotatedAt = findRotationIndex(nums);
        System.out.println("Array is rotated at: "+rotatedAt);
        // now we have 2 arrays - both sorted - we will divide them in 2 parts and search in both for the minimum value
        // we will save the current indexes
        int start_1 = 0;

        if (nums[start_1] < nums[rotatedAt]) {
            minNum = nums[start_1];
        } else {
            minNum = nums[rotatedAt];
        }
        return minNum;
    }

    private static int findRotationIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // If the array is not rotated
        if (nums[start] < nums[end]) return 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the rotation point
            if (mid < end && nums[mid] > nums[mid + 1]) return mid + 1;
            if (mid > start && nums[mid - 1] > nums[mid]) return mid;

            // Decide whether to go left or right
            if (nums[mid] >= nums[start]) {
                start = mid + 1; // Rotation is in the right half
            } else {
                end = mid - 1;   // Rotation is in the left half
            }
        }

        return 0;
    }

}
