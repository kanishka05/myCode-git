package BasicsAndBinarySearch;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int bigNum = scanner.nextInt();
        System.out.println("Enter the number you want to count the occurrence of :");
        int num =  scanner.nextInt();
        int count = 0;
        while (bigNum > 0) {
            if (bigNum % 10 == num) count++;
            bigNum = bigNum / 10;
        }
        System.out.println(num + " occurred " + count +" times.");
    }
}
