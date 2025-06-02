package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArraysWithSorting {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        //{1,2,2,1};
        int[] nums2 = {9,4,9,8,4};
        // {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> answer = new HashSet<>();
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
            }
        }
        return answer.stream().mapToInt(e->e).toArray();
    }
}
