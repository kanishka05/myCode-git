package BasicsAndBinarySearch;

import java.util.ArrayList;

public class MissingKthElementIn {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};//{1,2,3,4};
        int k = 5;//2;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        //find the numbers to e added before first element
        if (arr[0] > 1) {
            int diff = arr[0] - 1;
            for (int i = 1; i<=diff; i++) {
                    list.add(i);
            }
        }
        for (int j = 1; j < arr.length; j++) {
            int diff = arr[j] - arr[j-1];
            if (diff > 1) {
                for (int a = arr[j-1]+1; a <= arr[j]-1; a++) {
                    list.add(a);
                }
            }
        }

        if (list.size() > k) {
            return list.get(k-1);
        } else {
            for (int b = 1; b <= k+1; b++) {
                list.add(arr[arr.length-1] + b);
            }
        }
        System.out.println(list);
        return list.get(k-1);
    }
}
