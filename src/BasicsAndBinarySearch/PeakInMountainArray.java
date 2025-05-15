package BasicsAndBinarySearch;

public class PeakInMountainArray {
    public static void main(String[] args) {
        //find the peak in a mountain array - increase than decrease
        // also called bitonic array
       /* int[] arr = {4,5,6,7,8,9,10,3,2,1};*/
        int arr[] = {0,1,0};
        int peak = findPeak(arr);
        System.out.println("Peak is: "+peak);
        //get a mid
        //check if the right value is  less or more
        //if less - we have found the peak, its mid
        //if more - we have not found the peak yet - move forward - take right element as start and end as end - find mid - compare it with left and right - could be the peak

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
