package Sorting;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {1000,2000,3000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int minSal = Integer.MAX_VALUE;
        int maxSal = Integer.MIN_VALUE;
        int nums = salary.length - 2;
        double sum = 0;
        for (int s:
             salary) {
            minSal = Math.min(minSal, s);
            maxSal = Math.max(maxSal, s);
        }
        for (int sal:
             salary) {
            if (sal != minSal && sal != maxSal) {
                sum = sum + sal;
            }
        }
        return sum / nums;
    }
}
