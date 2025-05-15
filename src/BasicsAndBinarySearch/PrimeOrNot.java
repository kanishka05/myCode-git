package BasicsAndBinarySearch;

public class PrimeOrNot {
    public boolean isPrime(int num) {
        // prime number - only devisible by 1 and that number itself.
        if (num < 1 && num ==1) {
            System.out.println("Not applicable argument.");
            return false;
        }
        int i=2;

        while (i<= Math.sqrt(num)) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }
}
