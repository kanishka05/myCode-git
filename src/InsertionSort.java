import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2, 0, -1};
        insert(arr);
    }
    private static void insert(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            //System.out.println("i :"+i);
            for (int j = i+1; j > 0 ; j--) {
                //System.out.println("j :"+j);
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int leftNumIndex, int rightNumIndex) {
        int temp = arr[leftNumIndex];
        arr[leftNumIndex] = arr[rightNumIndex];
        arr[rightNumIndex] = temp;
    }
}
