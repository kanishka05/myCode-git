public class MovesToReachAnumber {
    public static void main(String[] args) {
        int target = 4;
        System.out.println(reachNumber(target));
    }
    public static int reachNumber(int target) {
        int start = 0;
        int moves = 1;
        target = Math.abs(target);
        int steps = 0;
        while (true) {
             start = start + moves;
            if (start == target) {
                steps = moves;
                break;
            } else if (start > target) {
                start = start - moves;
            }
            moves ++;
        }
        return steps;
    }
}
