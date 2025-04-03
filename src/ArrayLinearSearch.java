import java.util.Arrays;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        //find out if a number exists in an array or not - if yes return index, if not tell us it's not
        int[] arr = {5,7,8,3,9,1};
        int num = 34;
        //searchIt(arr, num);

        String str = "Kanishka";
        char syllable = 'o';
        //searchSyl(str, syllable);

        int[][] arr2D = {
                {1,2,300},
                {4,5,6,7,800},
                {99,10}
        };
        int toSearch = 2;
        //searchIn2D(arr2D, toSearch);
        maxIn2D(arr2D);
    }

    private static void maxIn2D(int[][] arr2D) {
        int max = arr2D[0][0];
        for (int r=0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[r].length; c++) {
                if (arr2D[r][c] > max) max = arr2D[r][c];
            }
        }
        System.out.println(max);
    }

    private static void searchIn2D(int[][] arr2D, int toSearch) {
        int countA=0;
        int countB=0;
        for (int r=0; r<arr2D.length; r++) {
            for (int c=0; c<arr2D[r].length; c++) {
                if (arr2D[r][c] == toSearch) {
                    System.out.println("found at "+r+","+c);
                    return;
                }
            }
        }
        System.out.println("not found.");
    }

    private static void searchSyl(String str, char syllable) {
        int count = 0;
        for (char a:
             str.toCharArray()) {
            if (a == syllable) {
                System.out.println("found "+syllable+" at index:"+count);
                return;
            }
            count ++;
        }
        System.out.println("Not found");
    }

    private static void searchIt(int[] arr, int num) {
        for (int a:
             arr) {
            if (a == num ) {
                System.out.println("Found at index: "+a);
                return;
            }
        }
        System.out.println("Not found.");
    }
}
