package BasicsAndBinarySearch;

public class SmallestNumGreaterThanTarget {
    public static void main(String[] args) {
      /*  char[] letters = {'x','x','y','y'};
        char target = 'z';*/
     /*   char[] letters = {'c','f','j'};
        char target = 'c';*/
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        char ans = letters[0];
        while (start <= end) {
            mid = start + (end-start)/2;
            if (letters[mid] > target) {
                //this could be the answer but we need to look its left;
                end = mid;
                ans = letters[end];
            } else {
                start = mid + 1;
            }
            if (start == end && end == mid) {
                break;
            }
        }
        return ans;
    }
}
