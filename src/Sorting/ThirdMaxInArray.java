package Sorting;
public class ThirdMaxInArray {
    public static void main(String[] args) {
        int[] nums = //{2,2,3,1};
                 //{1,2};
                 //{3,2,1};
                {5,2,4,1,3,6,0};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;
        for (int n : nums) {
            long  no =  (long) n;
            if (first == no || second == no || third == no) continue;
            if (n > first) {
                third = second;
                second = first;
                first = no;
            } else if (n > second) {
                third = second;
                second = no;
            } else if (n > third){
                third = no;
            }
        }
        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
    }

    /*{

// Step 1: Convert to Integer[]
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

// Step 2: Sort in descending order
        Arrays.sort(boxed, Collections.reverseOrder());

// Step 3: Convert back to int[]
        int[] sortedDesc = Arrays.stream(boxed).mapToInt(i -> i).toArray();

        ArrayList<Integer> numSet = new ArrayList();
        for (int n : sortedDesc) {
            if (!numSet.contains(n)) {
                numSet.add(n);
            }
        }
        if (numSet.size() < 3) {
            return numSet.get(0);
        } else {
            return numSet.get(2);
        }
    }*/
}
