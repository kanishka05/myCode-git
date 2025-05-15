package BasicsAndBinarySearch;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingKthElement_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
                    //{1,2,3,4};
        int k = 10;
                //2;
        System.out.println(findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        int missingNumCount = 0;
        int missingNum = 0;
        HashSet<Integer> arrSet = new HashSet<>();
        ArrayList<Integer> missingNumbersList = new ArrayList<>();
        for (int a : arr) {
            arrSet.add(a);
        }
        for (int i = 1; i<=arr[arr.length-1]; i++) {
            if (!arrSet.contains(i)) {
                missingNumbersList.add(i);
            }
        }
       if (missingNumbersList.size() < k) {
           for (int i = 1; i<=k; i++) {
               missingNumbersList.add(arr[arr.length-1] + i);
           }
       }
        System.out.println(missingNumbersList);
        return missingNumbersList.get(k-1);
    }
}
