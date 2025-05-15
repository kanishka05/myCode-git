package BasicsAndBinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,5,4,3,2,1};
        int target = 1;
        /*find the peak element
        *   - compare target with it.
        *   - if target<peak then bS in left else right*/
        int peak = findPeak(arr);
        System.out.println("peak is: "+arr[peak]);
        int start = 0;
        int end = arr.length-1;
        //since its peak - both left and right side will be lesser than this
        // we will first search in the left side - if not found than in the right side.
        int lIndex = bs(arr, target, start, peak);
        if (lIndex != -1) {
            System.out.println("Target found in left at: " + lIndex);
        } else {
            int rIndex = bs(arr, target, peak + 1, end);
            if (rIndex != -1) {
                System.out.println("Target found in right at: " + rIndex);
            } else {
                System.out.println("Target not found");
            }
        }

    }

    private static int bs(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // target not found
    }


    private static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start < end) {
            mid = (start + end)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
