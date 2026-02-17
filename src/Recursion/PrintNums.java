package Recursion;

public class PrintNums {
    public static void main(String[] args) {
        int num = 10;
        //printNums(10);
        printNumsRev(10);
    }

    private static void printNumsRev(int n) {
        if (n == 0) {
            return;
        }
        printNumsRev(n - 1);
        System.out.println(n);
    }

    private static void printNums(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNums(n - 1);
    }
}
