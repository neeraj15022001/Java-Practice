public class bubbleSortPractice {
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 4, 10};
        boolean isSorted = false;
        int endingNumber = arr.length - 1;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < endingNumber; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            endingNumber--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
