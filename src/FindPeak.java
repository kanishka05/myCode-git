public class FindPeak {
    public static void main(String[] args) {
        int[]  nums = {6,5,4,3,2,3,2};
                //{1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if (nums.length == 1) {
            return 0;
        }
        while (start < end) {
            mid = start + (end - start)/2;
            if (nums[mid] > nums[mid+1]) {
                //possible that the peak is in the left
                end = mid;
            } else if (nums[mid] < nums[mid+1]) {
                //possible that the peak is in the right
                start = mid + 1;
            }
    }
        return start;
}
}
