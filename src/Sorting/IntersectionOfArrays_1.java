package Sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfArrays_1 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        //{1,2,2,1};
        int[] nums2 = {9,4,9,8,4};
        //{2,2};
      System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> num1Map = new HashMap<>();
        for (int n1 : nums1) {
            if (num1Map.containsKey(n1)) {
                num1Map.put(n1, num1Map.get(n1) + 1);
            } else {
                num1Map.put(n1, 1);
            }
        }
        System.out.println(num1Map);
        for (int n2 : nums2) {
            if (num1Map.containsKey(n2)) {
                if (num1Map.get(n2) > 0) {
                    answer.add(n2);
                    num1Map.put(n2, num1Map.get(n2) - 1);
                }
            }
        }
        return answer.stream().mapToInt(e->e).toArray();
    }
    /*{
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                answer.add(nums1[i]);
                j++;
                i++;
            }
        }
        return answer.stream().mapToInt(e->e).toArray();
    }*/
}
