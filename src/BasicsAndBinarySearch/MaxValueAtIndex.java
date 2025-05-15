package BasicsAndBinarySearch;

public class MaxValueAtIndex {
    public static void main(String[] args) {
       int[] arr = {2, 3, 5, 9, 14, 16, 18};
       int target = 0;
       int start = 0;
       int end = arr.length - 1;
       int mid = 0;
       int ans = 0;

       while (start <= end) {
           mid = start + (end - start) / 2;
           //mid is the target - this is ceiling
           if (arr[mid] == target) {
               ans = mid;
               break;
           }

           //mid is greater than target - ceiling is in left
           if (arr[mid] > target) {
               ans = end;
               end = mid - 1;

           }

           //mid is lesser than target - ceiling is in right
           else {
               ans = start;
               start = mid + 1;

           }
       }
        System.out.println(arr[ans]);
    }
}
