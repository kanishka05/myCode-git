package BasicsAndBinarySearch;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //approach one
       /* if (a > b && a > c) {
            System.out.println("max is " +a);
        } else if (b >  a && b > c) {
            System.out.println("max is " +b);
        } else {
            System.out.println("max is " +c);
        }*/

        //approach two
        int max = 0;
        if (a > b) max = a;
            else max = b;
        if (c > max) max = c;
        System.out.println("max is "+max);
    }
}
