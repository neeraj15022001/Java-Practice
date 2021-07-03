public class QuickSortGFG {
    int partition(int[] array, int startingIndex, int endingIndex) {
        int pivotElement = array[startingIndex];
        int countOfSmallerElements = 0;
        int pivotIndex = 0;
        for (int i = startingIndex; i <= endingIndex; i++) {
            if (array[i] < pivotElement) {
                countOfSmallerElements++;
            }
        }
        pivotIndex = startingIndex + countOfSmallerElements;
        swapElements(array, startingIndex, pivotIndex);
        int k = 0, j = 0;
        k = startingIndex;
        j = endingIndex;
        while (k != pivotIndex && j != pivotIndex) {
            if (array[k] > array[j]) {
                swapElements(array, k, j);
                k++;
                j--;
            } else {
                k++;
            }
        }
        return pivotIndex;
    }

    void quickSort(int[] array, int startingIndex, int endingIndex) {
        if (startingIndex >= endingIndex) {
            return;
        }
        int partitionIndex = partition(array, startingIndex, endingIndex);
        quickSort(array, startingIndex, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, endingIndex);
    }

    void swapElements(int[] array, int index_1, int index_2) {
        int temp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = temp;
    }

    void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSortGFG qs = new QuickSortGFG();
        int[] array = {10,80,30,90,40,50,70};
        int startingIndex = 0;
        int endingIndex = array.length - 1;
        qs.quickSort(array, startingIndex, endingIndex);
        qs.printArray(array);
    }
}
