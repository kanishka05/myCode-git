import java.util.Arrays;

public class FindTwoNumsForTarget {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length-1;
        for (int i = 0; i<numbers.length; i++){
            if (numbers[start] + numbers[end] == target) {
                result[0] = start+1;
                result[1] = end+1;
            } else if (numbers[start] + numbers[end] > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
        }
        return result;
    }
}
