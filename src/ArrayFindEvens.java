public class ArrayFindEvens {
    public static void main(String[] args) {
        //find out even numbers in this array.
        int[] nums = {12, 354, 2, 6, 7896, 1445};
        //findEven(nums);
        //find out how many elements have even numbers of digits in this array.
        findEvenNumOfDigitsInEach(nums);
    }

    private static void findEvenNumOfDigitsInEach(int[] nums) {
        int evenCnt = 0;
        for (int a:
             nums) {
            int count = 0;
            while (a > 0) {
                a = a / 10;
                count ++;
            }
            if (count % 2 == 0) {
                evenCnt ++;
            }
        }
        System.out.println("This array has "+evenCnt+ " numbers of even digits.");
    }

    private static void findEven(int[] nums) {
        int count = 0;
        for (int a:
             nums) {
            if (a % 2 == 0) count ++;
        }
        System.out.println(count);
    }
}
