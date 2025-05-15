package BasicsAndBinarySearch;

public class InfArray {
    public static void main(String[] args) {
        int[] arr = {3, 4 , 5, 8, 10, 11, 14, 17, 19, 20, 25, 26, 29, 30, 34, 47, 48, 49, 40, 41};
        int target = 48;

        int start = 0;
        int end = 1;
        //first we will find the range
        while (arr[end] < target) {
            start = end + 1;
            end = end * 2;
        }
        System.out.println(find(arr, target, start, end));


}

    private static int find(int[] arr, int target, int start, int end) {
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    }
