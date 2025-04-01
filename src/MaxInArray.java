import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i=1; i<size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is "+max);
    }
}
