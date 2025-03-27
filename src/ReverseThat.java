import java.util.Scanner;

public class ReverseThat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt(); //1234
        int rem = 0;
        int numRev = 0;
        while (num > 0) {
            rem = num%10;
            num = num/10;
            numRev = numRev * 10 + rem;
            //System.out.print(numRev); - this is to print the reversed number.
        }
        System.out.print(numRev); // - this is to get the actual reversed number.
    }
}
