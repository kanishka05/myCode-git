package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int index = 0;
        for (int n : nums) {
            int compliment = target - n;
            if (map.containsKey(compliment)) {
                result[0] = index;
                result[1] = map.get(compliment);
            } else {
                map.put(n, index);
            }
            index++;
        }
        return result;
    }
}
