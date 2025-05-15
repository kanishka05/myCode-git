package BasicsAndBinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int o=0; o<3; o++) {
            System.out.println("Enter the values in row "+o);
            ArrayList inner = new ArrayList();
            for (int i = 0; i<3; i++){
                int value = scanner.nextInt();
                inner.add(value);
            }
            al.add(inner);
        }
        System.out.println(al);
    }
}
