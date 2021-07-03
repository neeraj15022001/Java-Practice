import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // check if this number is prime
        int d = 2; // Iterator
        while (d <= n / 2) {
            if (n % d == 0) {
                System.out.println("Number is not prime");
                return;
            }
            d += 1;
        }
        System.out.println("Number is prime");
    }
}
