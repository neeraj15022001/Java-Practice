public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        int numberOfPrimeNumbersToGet = 10;
        int numberOfPrimeNumbersFound = 0;
        int currentIntegerToBeChecked = 2;
        boolean result;
        while (numberOfPrimeNumbersFound <= numberOfPrimeNumbersToGet) {
            result = checkPrimeOrNot(currentIntegerToBeChecked);
            if (result) {
                System.out.println(currentIntegerToBeChecked);
                numberOfPrimeNumbersFound++;
            }
            currentIntegerToBeChecked++;
        }
    }

    private static boolean checkPrimeOrNot(int numberToBeChecked) {
        int iterator = 2;
        while (iterator <= numberToBeChecked / 2) {
            if (numberToBeChecked % iterator == 0) {
                return false;
            }
            iterator++;
        }
        return true;
    }
}
