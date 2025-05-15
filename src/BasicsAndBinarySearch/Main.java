package BasicsAndBinarySearch;

public class Main {
    public static void main(String[] args) {
        PrimeOrNot primeOrNot = new PrimeOrNot();
        int num = 11;
        boolean isprime = primeOrNot.isPrime(num);
        if (isprime) System.out.println(num+" is prime");
        else System.out.println(num+" is not prime");
    }
}