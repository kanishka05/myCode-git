package BasicsAndBinarySearch;

import java.util.HashSet;

public class InterserctionOfArrayPart_1 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(intersection(nums1, nums2));

       /* HashMap<Integer, Integer> nums1CountMap = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();
        for (int n1 : nums1) {
            if (nums1CountMap.containsKey(n1)) {
                nums1CountMap.put(n1, nums1CountMap.get(n1) + 1);
            } else {
                nums1CountMap.put(n1, 1);
            }
        }
        System.out.println(nums1CountMap);
        for (int n2 : nums2) {
            if (nums1CountMap.containsKey(n2) && !result.contains(n2)) {
                result.add(n2);
            }
        }
        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());*/
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1Set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        //convert nums1 in a set
        for (int n1 : nums1) {
            num1Set.add(n1);
        }
        //check if values in nums2 array are there in num1Set - if yes add to result set
        for (int n2 : nums2) {
            if (num1Set.contains(n2)) {
                result.add(n2);
            }
        }
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }
}
