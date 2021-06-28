public class Firstnprime {
    public static void main(String[] args) {
        int countOfPrimeNumbers = 1;
        int numberUptoWhichPrimeNumbersAreToBeFound = 5;
        int currentIntegerToBeChecked = 2;

        while (countOfPrimeNumbers <= numberUptoWhichPrimeNumbersAreToBeFound) {
            boolean result = checkPrimeOrNot(currentIntegerToBeChecked);
            if (result == true) {
                System.out.print(currentIntegerToBeChecked + " ");
                countOfPrimeNumbers++;
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