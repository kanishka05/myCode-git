package Sorting;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2};
                 //{1,2,3};
        int[] s = {1,2,3};
                //{1,1};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int kid = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                kid++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return kid;
    }
}
