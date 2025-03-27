import java.util.Scanner;

public class Fibonacci  {
    public static void main(String[] args) {
        //Print the whole series till num

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number till where you want to generate the Fibonacci series :");
        int num = scanner.nextInt();
        int f = 0;
        int s = 1;
        System.out.println("Series :");
        System.out.print(f + " " +s + " ");
        int i = 0;
        while (i <= num) {
            int t = f + s;
                f = s;
                s = t;
            System.out.print(t + " ");
            i++;
        }*/

        //print the nth element from the series

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element number you want from the Fibonacci series :");
        int num = scanner.nextInt();
        int f = 0;
        int s = 1;
        int t = 0;
        int i = 2;
        while (i <= num) {
            t = f + s;
            f = s;
            s = t;

            i++;
        }
        System.out.print(t + " ");
    }
}
