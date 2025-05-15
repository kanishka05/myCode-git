package BasicsAndBinarySearch;

public class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1};//{3,3,7,7,10,11,11};
                //{1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int ans = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        while (start<=end) {
            if (nums[start + 1] != nums[start]) {
                ans = nums[start];
                break;
            } else {
                start = start + 2;
            }
            if (nums[end - 1] != nums[end]){
                ans = nums[end];
                break;
            } else {
                end = end - 2;
            }
        }
        return ans;
    }
}
