import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if(isArmStrong(num)) System.out.println(num + " is an Armstrong number");
        else System.out.println(num + " is not an Armstrong number");
    }
    public static boolean isArmStrong(int n) {
        int originalNum = n;
        int oNum = n;
        int rem = 0;
        double sum = 0;
        int power = 0;
        while (n>0) {
            n/=10;
            power++;
        }
        while (originalNum>0) {
             rem = originalNum%10;
             double cubeOfRem = Math.pow(rem,power);
             sum = sum + cubeOfRem;
            originalNum = originalNum/10;
        }
        if (sum == oNum) return true;
        else return false;
    }
}
