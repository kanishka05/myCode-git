import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairSwap {
    public static void main(String[] args) {
        int[] aliceSizes = {2};
        int[] bobSizes = {1,3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totalOfAliceCandies = 0;
        int totalOfBobCandies = 0;
        int[] result = new int[2];
        Set bobs =  new HashSet();
        for (int ac : aliceSizes) {
            totalOfAliceCandies+=ac;
        }
        for (int bc : bobSizes) {
            totalOfBobCandies+=bc;
            bobs.add(bc);
        }

        int diffOfBobAliceCandies = (totalOfBobCandies - totalOfAliceCandies) / 2;
            for (int acan : aliceSizes) {
                int bcan = acan + diffOfBobAliceCandies;
                if (bobs.contains(bcan)) {
                    result[0] = acan;
                    result[1] = bcan;
                    return result;
                }
            }
            return new int[]{-1, -1};
    }
}
