package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String text = "abcbaea";
        System.out.println(isPalindrome(text));
    }

    private static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start <= end) {
            if (text.charAt(start) == text.charAt(end)) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }
}
