package BasicsAndBinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int partsNum = 2;
        System.out.println(splitArray(nums, partsNum));
    }
    public static int splitArray(int[] nums, int partsNum) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }
        while (start < end) {
            int mid = start + (end - start)/2;
            int sumOfSubArray = 0;
            int pieces = 1;
            for (int num : nums) {
                if ((sumOfSubArray + num) > mid ) {
                    //cant add this number in this sub array//create a new one//for the new one the initial sum will be the number which I am adding
                    sumOfSubArray = num;
                    pieces++;//this shows that another sub array has been added
                } else {
                    sumOfSubArray = sumOfSubArray + num;
                }
            }
            if (pieces > partsNum) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
     }
}
