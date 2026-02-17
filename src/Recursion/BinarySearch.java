package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 11;
        int start = 0;;
        int end = arr.length - 1;
        int index = findIndexOfTarget(arr, start, end, target);
        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target FOUND! at index "+index);
        }
    }

    private static int findIndexOfTarget(int[] arr, int start, int end, int target) {
        int mid = (start + end) / 2;
        if ( start > end) {
            return -1;
        } else if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end =  mid - 1;
        }
        return  findIndexOfTarget(arr, start, end, target);
    }
}
