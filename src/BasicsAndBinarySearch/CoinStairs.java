package BasicsAndBinarySearch;

public class CoinStairs {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int coins = n;
        int ans = 1;
        int row = 1;

        while (coins > row) {
            coins = coins - row;
            row ++;
            if (coins < row) row--;
        }
        return row;
    }
}
