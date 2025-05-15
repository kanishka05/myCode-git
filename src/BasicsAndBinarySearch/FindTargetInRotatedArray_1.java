package BasicsAndBinarySearch;

public class FindTargetInRotatedArray_1 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        // {1};//
        //{4,5,6,7,0,1,2};
        int target = 3;
        // 1;
        //0;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        boolean targetIndex = false;
        if (nums.length == 1) {
            if (nums[0] == target) return true;
            else return targetIndex;
        }
        //first we will find out the index where the array was rotated.

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int rotatedAt = findRotationIndex(start, end, mid, nums);

        // now we have 2 arrays - both sorted - we will divide them in 2 parts and search in both
        // we will save the current indexes
        int start_1 = 0;
        int end_1 = rotatedAt - 1;
        int m1 = 0;

        int start_2 = rotatedAt;
        int end_2 = nums.length - 1;
        int m2 = 0;



        //binary search in first array
        while (start_1 <= end_1) {
            m1 = start_1 + (end_1 - start_1)/2;
            if (nums[m1] == target) {
                targetIndex = true;
                break;
            } else if (nums[m1] > target) {
                end_1 = m1 - 1;
            } else {
                start_1 = m1 + 1;
            }
        }

        //if targetIndex value is -1 here, meaning we haven't found the target yet, time to search in 2nd array
        if (!targetIndex) {
            //binary search in 2nd array
            while (start_2 <= end_2) {
                m2 = start_2 + (end_2 - start_2)/2;
                if (nums[m2] == target) {
                    targetIndex = true;
                    break;
                } else if (nums[m2] > target) {
                    end_2 = m2 - 1;
                } else {
                    start_2 = m2 + 1;
                }
            }
        }
        return targetIndex;
    }

    public static int findRotationIndex(int start, int end, int mid, int[] nums) {
        int indx = 0;
        while (start <= end) {
            if (nums[start] > nums[start+1]) {
                indx = start + 1;
                break;
            } else {
                start = start + 1;
            }
            if (nums[end - 1] > nums[end]) {
                indx =  end;
                break;
            } else {
                end = end - 1;
            }
        }
        return  indx;
    }
}
