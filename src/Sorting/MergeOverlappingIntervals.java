package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][]  intervals = {{1,3},{2,6},{8,10},{15,18}} ;
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(intervals));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = null;
        for (int i = 0; i < intervals.length-1; i++) {
            a = new ArrayList<>();
            if (intervals[i][1] >= intervals[i + 1][0]) {
                a.add(intervals[i][0]);
                a.add(intervals[i + 1][1]);
                i++;
            } else {
                a.add(intervals[i][0]);
                a.add(intervals[i][1]);
            }
            ans.add(a);
        }
        assert a != null;
        if (!a.get(1).equals(intervals[intervals.length - 1][1])) {
            List<Integer> last = new ArrayList<>();
            last.add(intervals[intervals.length - 1][0]);
            last.add(intervals[intervals.length - 1][1]);
            ans.add(last);
        }

        return ans.stream()
                .map(list -> list.stream().mapToInt(i -> i).toArray())
                .toArray(int[][]::new);
    }
}
