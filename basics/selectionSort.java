public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        performSelectionSort(arr);
        printArray(arr);
    }

    public static void performSelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int firstIndex = i;
            int indexofMinValue = findMinimumElement(array, firstIndex, array.length - 1);
            swap(array, firstIndex, indexofMinValue);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // [10,80,30,90,40,50,70] startingIndex:0 endingIndex:6
    public static int findMinimumElement(int[] array, int startingIndex, int endingIndex) {
        int minValue = Integer.MAX_VALUE;
        int indexOfMinValue = -1;
        for (int i = startingIndex; i <= endingIndex; i++) {
            if (array[i] < minValue) {
                minValue = array[i]; // 30
                indexOfMinValue = i;
            }
        }
        return indexOfMinValue;
    }
}
