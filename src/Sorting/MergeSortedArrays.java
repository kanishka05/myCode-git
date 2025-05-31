package Sorting;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,1,0,0,0,0,0};
            //{-1,-1,0,0,0,0};
            //{4,5,6,0,0,0};
            //{1};
            //{0};//{1,2,3,0,0,0};
        int[] nums2 = {-1,0,2,2,3};
            //{-1,0};
            //{1,2,3};
            //{};
           // {1};//{2,5,6};
        int m = 4;
        int n = 5;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0 && m == 0) {
            return;
        }
        if (n == 0) {
            return;
        }
        if (m == 0 && n > 0) {
            //copy num2 to num1
            copyNum2toNum1(nums1, nums2, m, n);
            return;
        }
        if (m > 0 && n > 0) {
            int lastIndexNum1 = m-1;
            int firstIbdexNum2 = 0;
            if (nums1[lastIndexNum1] <= nums2[firstIbdexNum2]) {
                //just add num2 after the last index of num1
                copyNum2toNum1(nums1, nums2, m, n);
            } else {
                swap(nums1, lastIndexNum1, nums2, firstIbdexNum2);
                sort(nums1, m);
                sort(nums2, n);
                merge(nums1, m, nums2, n);
            }
        }
    }

    private static void copyNum2toNum1(int[] nums1, int[] nums2, int m, int n) {
        int zero = m;
        for (int i = 0; i < n; i++) {
            nums1[zero] = nums2[i];
            zero++;
        }
    }

    private static void sort(int[] nums1, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (j == m) {
                    break;
                }
                if (nums1[j - 1] > nums1 [j]) {
                    swap(nums1, j-1, nums1, j);
                }
            }
        }
    }

    private static void swap(int[] nums1, int i, int[] nums2, int i1) {
        int temp = nums1[i];
        nums1[i] = nums2[i1];
        nums2[i1] = temp;
    }
}
