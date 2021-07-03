public class insetionSort {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 10, 12, 1, 5, 6};
        performInsertionSort(array);
    }

    public static void performInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j + 1] < array[j]) {
                swap(array, j, j + 1);
                j--;
            }
        }
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
