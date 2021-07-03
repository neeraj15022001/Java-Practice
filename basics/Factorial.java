public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int n = 10;
        while(n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.print(fact);
    }
}


