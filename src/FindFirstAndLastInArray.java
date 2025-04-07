import java.util.Arrays;

public class FindFirstAndLastInArray {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] pos = {-1, -1};
        int findFirstPos = findPosition(arr, target, true);
        if (arr[findFirstPos] == target) pos[0] = findFirstPos;
        int findSecondPos =  findPosition(arr, target, false);
        if (arr[findSecondPos] == target) pos[1] = findSecondPos;
        System.out.println(Arrays.toString(pos));

    }

    private static int findPosition(int[] arr, int target, boolean firstTime) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {
            mid = (start + end)/2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstTime) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
