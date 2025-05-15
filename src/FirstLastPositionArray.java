public class FirstLastPositionArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int start = 0;
        int end = nums.length - 1;
        int firstMid = findIt(nums, target);
        if (firstMid != -1) {
            int first_pos = findPos(nums, target, start, firstMid, true);
            int last_pos = findPos(nums, target, firstMid, end, false);
            System.out.println(first_pos + "  " + last_pos);
        } else {
            System.out.println(-1 + "  " + -1);
        }
    }

    private static int findIt(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int m =  start + (end - start)/2;
            if (nums[m] > target) {
                end = m - 1;
            } else if (nums[m] < target) {
                start = m + 1;
            } else {
                ans = m;
              break;
            }
        }
        return ans;
    }

    private static int findPos(int[] nums, int target, int start, int end, boolean isFirstPosition) {
        int f = -1;
        while (start <= end) {
            int m =  start + (end - start)/2;
            if (nums[m] > target) {
                end = m - 1;
            } else if (nums[m] < target) {
                start = m + 1;
            } else {
                f = m;
                if (isFirstPosition)
                    end = m - 1;
                else
                    start = m + 1;
            }
        }
        return f;
    }

}
