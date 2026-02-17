package Recursion;

public class SumOfNum {
    public static void main(String[] args) {
        int num = 1342;
        System.out.println(sumOfIt(num));
    }

    private static int sumOfIt(int num) {
        if (num < 1) {
            return 0;
        }
        return (num % 10) + sumOfIt(num / 10);
    }
}
