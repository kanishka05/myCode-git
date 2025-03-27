import java.util.Scanner;

public class CaseOfAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().trim().charAt(0);
        if (a >= 'a' && a <='z') System.out.println("lower case");
        else System.out.println("upper case");
    }
}
