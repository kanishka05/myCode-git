package BasicsAndBinarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class FindIntervalsBS {
    public static void main(String[] args) {
        int[][] intervals = {
            {3,4},
            {2,3},
            {1,2}
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    private static int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        TreeMap<Integer, Integer> starValueIndexMap = new TreeMap<>();
        for (int index = 0; index < intervals.length; index++) {
            starValueIndexMap.put(intervals[index][0], index);
        }
        System.out.println(starValueIndexMap);
        //for each interval - will compare the last value with the starts of all - should be >= the last value
        for (int interval=0; interval<intervals.length; interval++) {
            int end = intervals[interval][1];
            Integer key = starValueIndexMap.ceilingKey(end);
            result[interval] = key != null ? starValueIndexMap.get(key) : -1;
        }
        return result;
    }
}
