package BasicsAndBinarySearch;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        /*take a sorted array and the target element.
        find the mid
            -compare target with mid-if same-found
            -if target<mid - take the left array otherwise take the right array.
            -reassign start and end as per the new array taken.
            -find the mid again
                -compare target with mid-if same-found
                -if target<mid - take the left array otherwise take the right array.
                -reassign start and end as per the new array taken.
                 -find the mid again
                    -compare target with mid-if same-found
                    -if target<mid - take the left array otherwise take the right array.
                    -reassign start and end as per the new array taken.

                We will repeat this till start index > end index (bcs when only one element remains - start and end index are the same)
        */
        int[] arr = {12,23,34,45,56,67,78,88,100};
        int target = 23;
        int answer = binarySearchIt(arr, target);
        if (answer == -1) {
            System.out.println(target+" Target is not in the array.");
        } else {
            System.out.println("found it at index: "+answer);
        }

       /* if (arr[startIndex] == target) System.out.println("found it !");
        else System.out.println(target+" Target is not in the array.");*/
    }

    private static int binarySearchIt(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int mid = 0;

        while (startIndex <= endIndex) {
            mid = (startIndex + endIndex)/2; //better way s + (e-s)/2 => this way it will not exceed the max int limit.
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }
}
