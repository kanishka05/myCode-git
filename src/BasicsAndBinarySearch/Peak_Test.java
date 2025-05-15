package BasicsAndBinarySearch;

public class Peak_Test {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int peakIndex = findPeak(arr);
        System.out.println("peak: "+arr[peakIndex]);
        if (findTarget(arr, target, 0, peakIndex) == -1) {
            System.out.println(findTarget(arr, target, peakIndex+1, arr.length-1 ));
        }
    }

    private static int findTarget(int[] arr, int target, int start, int end) {
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }  else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (arr[mid] > arr[mid+1]) {
                ans = arr[mid];
                end = mid - 1;
            } else if (arr[mid] < arr[mid+1]){
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return start;
    }
}
