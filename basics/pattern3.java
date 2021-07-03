import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            // System.out.println("Value of i is " + i);
            for (int j = 4; j >= 1; j--) {
                // System.out.println("Value of k is " + k);
                if (j > i) {
                    System.out.print("-");
                } else {
                    System.out.print(k);
                    k += 1;
                }

            }
            System.out.println();
        }

    }
}
