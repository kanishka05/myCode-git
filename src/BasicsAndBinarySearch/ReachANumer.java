package BasicsAndBinarySearch;

public class ReachANumer {
    public static void main(String[] args) {
        int target = 2;
        System.out.println(reachNumber(target));
    }
    public static int reachNumber(int target) {
        target = Math.abs(target); // Symmetry: target -5 is same as 5
        int sum = 0;
        int step = 0;

        while (true) {
            step++;
            sum += step;
            if (sum >= target && (sum - target) % 2 == 0) {
                return step;
            }
        }
    }

}
