public class CeilingOfAcharArray {
    public static void main(String[] args) {
        char[] arr = {'b','e','g','j','o','z'};
        char target = 'z';
        int index = findCeiling(arr, target);
        System.out.println("Answer for "+target+" is: " +arr[index]);
    }

    private static int findCeiling(char[] arr, char target) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end)/2;
            if (arr[mid] == target) {
                if (start != arr.length - 1) {
                    return mid + 1;
                } else return 0;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            } else {
               start = mid + 1;
            }
        }
        return start;
    }
}
