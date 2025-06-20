package Patterns;

public class Patterns {
    public static void main(String[] args) {
        //pattern_1();
        //pattern_2();
        //pattern_3();
        pattern_4();

    }

    private static void pattern_4() {
        int n = 4;
        int totalRows = 2*n-1;
        for (int row = 1; row <= n; row++) {
            for (int space = n-1; space >= row; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int star = n-1; star >= row; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern_3() {
        for (int row = 1; row <=5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <=4; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern_2() {
        for (int row = 1; row <= 5; row ++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private static void pattern_1() {
        for (int i = 1; i<=5; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
