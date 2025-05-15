package BasicsAndBinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int sqrt = findSqrt(10);
        System.out.println(sqrt);
    }

    private static int findSqrt(int N) {
        int start = 1;
        int end = N;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            long s = (long)mid * mid;
            if (s == N) return mid;
            else if (s > N) end = mid-1;
            else start = mid + 1;

        }
        return end;
    }
}
