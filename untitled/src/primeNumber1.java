import java.util.Scanner;

public class primeNumber1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // check if this number is prime
        boolean isPrime = true;
        // prime numbers are those which are divisible by their themselves and 1.
        if (n == 2) {
            System.out.println("Two is a prime number");
            return;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Is Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
