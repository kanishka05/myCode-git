package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArraysWithoutSorting {
    public static void main(String[] args) {
        int[] nums1 = //{4,9,5};
        {1,2,2,1};
        int[] nums2 = //{9,4,9,8,4};
        {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        //int[] ans = new int[Math.min(nums1.length, nums2.length)];
        ArrayList<Integer> ans = new ArrayList<>();
        int num1Index = 0;
        int num2Index = 0;
        while (num1Index <  nums1.length) {
            if (num2Index >= nums2.length) {
                num2Index = 0;
                num1Index ++;
            }
            if (num1Index<nums1.length && !ans.contains(nums1[num1Index])) {
                if (nums1[num1Index] == nums2[num2Index]) {
                    ans.add(nums2[num2Index]);
                }
            }
            num2Index++;
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}
