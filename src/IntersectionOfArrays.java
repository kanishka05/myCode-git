import java.util.*;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> n1Map = new HashMap<>();
        Map<Integer, Integer> n2Map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int n1 : nums1) {
            int n1Count = 1;
            if (n1Map.containsKey(n1)) {
               int value = n1Map.get(n1);
               n1Map.put(n1, value + 1);
            } else {
                n1Map.put(n1, n1Count);
            }
        }
        System.out.println(n1Map);

        for (int n2 : nums2) {
            int n2Count = 1;
            if (n2Map.containsKey(n2)) {
                int value = n2Map.get(n2);
                n2Map.put(n2, value + 1);
            } else {
                n2Map.put(n2, n2Count);
            }
        }
        System.out.println(n2Map);

        for (int num1 : n1Map.keySet()) {
            if (n2Map.containsKey(num1)) {
                int countInN1 = n1Map.get(num1);
                int countInN2 = n2Map.get(num1);
                int freq = 0;
                if (countInN1 <= countInN2) {
                    freq = countInN1;
                } else {
                    freq = countInN2;
                }
                intersectionArray(freq, num1, result);
            }
        }
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

    private static void intersectionArray(int countInN1, int num1, ArrayList<Integer> result) {
        for (int i = 0;i < countInN1; i++) {
            result.add(num1);
        }
    }
}
