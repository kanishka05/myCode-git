import java.util.Arrays;

public class VarLenArgs {
    public static void main(String[] args) {
        test(1,2,3,4,5,6,7,8,9);
        testMultiple(9,8,"hema", "rekha", "jaya", "sushma");
    }
    public static void test(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    public static void testMultiple(int a, int b, String ...v) {
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
}
