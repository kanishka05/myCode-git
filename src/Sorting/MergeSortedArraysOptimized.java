package Sorting;

import java.util.Arrays;

public class MergeSortedArraysOptimized {
    public static void main(String[] args) {
        int[] num1 = {2,0};//{-1,-1,0,0,0,0};
        //{0, 0, 0};
        //{1,2,3,0,0,0};
        //{-1, 0, 1, 1, 0, 0, 0, 0, 0};
        int[] num2 = {1};
        //{-1,0};
        //{1, 2, 3};
        //{2,5,6};
        //{-1, 0, 2, 2, 3};
        int m = 1;//4;//0;//3;//4;
        int n = 1;//2;//3;//3;//5;
        mergeThem(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }
    private static void copyNum2toNum1(int[] nums1, int[] nums2, int m, int n) {
        int zero = m;
        for (int i = 0; i < n; i++) {
            nums1[zero] = nums2[i];
            zero++;
        }
    }
    private static void mergeThem(int[] num1, int m, int[] num2, int n) {
        if (n == 0 && m == 0) {
            return;
        }
        if (n == 0) {
            return;
        }
        if (m == 0 && n > 0) {
            //copy num2 to num1
            copyNum2toNum1(num1, num2, m, n);
            return;
        }

        int pointerLastNum1 = m - 1;
        int pointerLastNum2 = n - 1;
        int pointerLastFianl = (m + n) - 1;
        while (pointerLastNum1 >= 0 && pointerLastNum2 >= 0) {
            if (num1[pointerLastNum1] > num2[pointerLastNum2]) {
                num1[pointerLastFianl] = num1[pointerLastNum1];
                pointerLastFianl--;
                pointerLastNum1--;
            } else if (num1[pointerLastNum1] < num2[pointerLastNum2]) {
                num1[pointerLastFianl] = num2[pointerLastNum2];
                pointerLastFianl--;
                pointerLastNum2--;
            } else {
                num1[pointerLastFianl] = num2[pointerLastNum2];
                pointerLastFianl--; // when you -- this the final pointer decreases
                pointerLastNum2--;
            }
        }
        while (pointerLastNum2 >= 0) {
            num1[pointerLastFianl--] = num2[pointerLastNum2--];
        }
    }
}
