package BasicsAndBinarySearch;

public class CeilingOfAnumber {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,22,30};
        int target = 4;

        int ans = searchCeiling(arr, target);
        System.out.println("Ceiling of "+target+" is:"+arr[ans]);
    }

    private static int searchCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end)/2;
            if (arr[mid] == target) {
                System.out.println("found the target");
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("we have not found the element");
       /* if (mid < arr.length-1 && mid > 0) {
            if (arr[mid-1 ] < arr[mid+1]) return mid+1;
            else return mid-1;
        }* OR/

        */
        return start;
    }
}
