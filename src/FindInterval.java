import java.util.Arrays;

public class FindInterval {
    public static void main(String[] args) {
        int[][] intervals = /*{
                {3,4},
                {2,3},
                {1,2}
        };*/
              /*  {{1,4},{2,3},{3,4}};*/
               /* {{1,2}};*/
               /* {{4,5},{2,3},{1,2}};*/
               /* {
                        {1, 2},
                        {2, 3},
                        {0, 1},
                        {3, 4}
                };*/
                {{1,1},{3,4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals) {
        int col_0 = 0;
        int col_1 = 1;
        int[] rightIntervalIntervalIndexes = new int[intervals.length];
        Arrays.fill(rightIntervalIntervalIndexes, -1);
        for (int row = 0; row < intervals.length; row++) {
            for (int rowsToCompare = 0; rowsToCompare < intervals.length; rowsToCompare++ ) {
                //if (rowsToCompare != row) {
                    if (intervals[row][col_1] == intervals[rowsToCompare][col_0]) {
                        //found the right interval for first row
                        rightIntervalIntervalIndexes[row] = rowsToCompare;
                        break;
                    } else if (intervals[row][col_1]  < intervals[rowsToCompare][col_0] ) {
                        if (rightIntervalIntervalIndexes[row] == -1 ||
                                intervals[rowsToCompare][col_0] < intervals[rightIntervalIntervalIndexes[row]][col_0]) {
                            rightIntervalIntervalIndexes[row] = rowsToCompare;
                        }
                    }
                //}
            }
        }
        return rightIntervalIntervalIndexes;
    }
}
