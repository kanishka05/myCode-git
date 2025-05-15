package BasicsAndBinarySearch;

import java.util.Arrays;

public class ArraySpecial {
    public static void main(String[] args) {
        int[] num = {8,9,10,11,12};
        System.out.println(specialArray(num));
    }
    public static int specialArray(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1]; // index i = count of nums >= i

        // BasicsAndBinarySearch.Count how many numbers >= i for i = 0 to n
        for (int num : nums) {
            if (num >= n) {
                count[n]++;
            } else {
                count[num]++;
            }
        }
        System.out.println(Arrays.toString(count));
        int total = 0;
        for (int i = n; i >= 0; i--) {
            total += count[i];
            if (total == i) {
                return i;
            }
        }

        return -1;
    }
}
