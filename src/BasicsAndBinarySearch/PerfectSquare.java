package BasicsAndBinarySearch;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(checkPerfectSqr(num));
    }

    private static boolean checkPerfectSqr(int num) {

         if (num == 0 || num == 1) {
        return true; // Handle edge case for 0 and 1
    }
    int start = 1;
    int end = num;
    int mid = 0;
        while(start <= end) {
        mid = start +  (end-start) / 2;
        long s = (long) mid*mid;
        if (s == num) return true;
        else if (s > num) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
        return false;
}
}
