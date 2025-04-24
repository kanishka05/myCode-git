import javax.naming.PartialResultException;
import java.util.Arrays;

public class NegativeNumsInGrid {
    public static void main(String[] args) {
        //given grid is sorted in desc order.
        int[][] grid = {
               /* {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}*/
                /*{3,2},
                {1,0}*/
                {1,-1},
                {-1,-1}
        };
        int negativeCounts = 0;
        for (int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
            //apply binary search in the inner arrays.
            negativeCounts += binarySearchNegatives(ints);
        }
        System.out.println("Total negative numbers in the array are: " +negativeCounts);
    }

    private static int binarySearchNegatives(int[] innerArr) {
        int start = 0;
        int end  = innerArr.length-1;
        int countNegs = 0;
        int mid  = 0;
        while (start <= end) {
           mid = (start + end) / 2;
             if (innerArr[mid] >= 0) {
                 //still a positive number, have to look right
                 start = mid + 1;

             } else {
                 //found a negative number - look left if any there
                countNegs ++;
                end = mid - 1;
             }
        }
        if (countNegs > 0)
            return innerArr.length - mid ;
        else return 0;
    }
}
