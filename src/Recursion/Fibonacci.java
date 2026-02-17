package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibo(2));
    }

    private static int findFibo(int fibo) {
        if (fibo < 2) return fibo;
        return findFibo(fibo-1) + findFibo(fibo-2);
    }
}
