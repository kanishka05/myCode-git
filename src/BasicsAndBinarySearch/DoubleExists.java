package BasicsAndBinarySearch;

import java.util.HashSet;
import java.util.Set;

public class DoubleExists {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }

    private static boolean checkIfExist(int[] arr) {
        Set<Integer> seenSet = new HashSet<>();

        for (int num : arr) {
            // Check both double and half (if even)
            if (seenSet.contains(num * 2) || (num % 2 == 0 && seenSet.contains(num / 2))) {
                return true;
            }
            seenSet.add(num);
        }
        return false;
    }
}
