public class FirstPrimeFixedn {
    public static void main(String[] args) {
        int numberUptoWhichPrimeNumbersAreToBeFound = 10;
        int currentIntegerToBeChecked = 2;

        for (int i = 2; i < numberUptoWhichPrimeNumbersAreToBeFound; i++) {
            boolean result = checkPrimeOrNot(currentIntegerToBeChecked);
            if (result == true) {
                System.out.print(currentIntegerToBeChecked + " ");
            }
            currentIntegerToBeChecked++;
        }
    }

    static boolean checkPrimeOrNot(int numberToBeChecked) {
        int i = 2;
        boolean isPrime = true;
        while (i <= numberToBeChecked / 2) {
            if (numberToBeChecked % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }
}