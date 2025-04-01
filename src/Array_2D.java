import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[2][];
        for (int i=0;i< arr.length; i++) {
            System.out.println("Enter the number of columns for row "+i);
            int col = scanner.nextInt();
            int[] innerArr = new int[col];
            for (int c=0; c<innerArr.length; c++) {
                System.out.println("Enter the value at row "+i+" and column "+c);
                int value = scanner.nextInt();
                innerArr[c] = value;
            }
            arr[i] = innerArr;
        }
        for (int[] a:
             arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
