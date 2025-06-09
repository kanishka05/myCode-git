package Sorting;

public class MaxProd {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int max_1 = 0;
        int max_2 = 0;
        for (int n : nums) {
            if (n > max_1) {
                max_2 = max_1;
                max_1 = n;
            } else if (n > max_2) {
                max_2 = n;
            }
        }
        return (max_1 - 1) * (max_2 - 1);
    }
}
