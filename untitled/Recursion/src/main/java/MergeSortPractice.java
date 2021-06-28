public class MergeSortPractice {
    void sort(int[] input, int startingIndex, int endingIndex) {
//        System.out.println("startingIndex: " + startingIndex + ", endingIndex: " + endingIndex);
        if (startingIndex < endingIndex) {
            int mid = (startingIndex + (endingIndex - 1)) / 2;
            sort(input, startingIndex, mid);
            sort(input, mid + 1, endingIndex);
            merge(input, startingIndex, endingIndex, mid);
        }

    }

    void merge(int[] input, int startingIndex, int endingIndex, int mid) {
        int sizeOfFirstArray = (mid - startingIndex + 1);
        int sizeOfSecondArray = (endingIndex - mid);
        int[] arr1 = new int[sizeOfFirstArray];
        int[] arr2 = new int[sizeOfSecondArray];
        for (int i = 0; i < sizeOfFirstArray; ++i) {
            arr1[i] = input[startingIndex + i];
        }
        for (int j = 0; j < sizeOfSecondArray; ++j) {
            arr2[j] = input[mid + 1 + j];
        }

        int i = 0, j = 0, k = startingIndex;
        while (i < sizeOfFirstArray && j < sizeOfSecondArray) {
            if (arr1[i] <= arr2[j]) {
                input[k] = arr1[i];
                i++;
            } else {
                input[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < sizeOfFirstArray) {
            input[k] = arr1[i];
            i++;
            k++;
        }
        while (j < sizeOfSecondArray) {
            input[k] = arr2[j];
            k++;
            j++;
        }
    }

    void printArray(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6, 2, 7};
        MergeSortPractice msp = new MergeSortPractice();
        msp.printArray(arr);
        msp.sort(arr, 0, arr.length - 1);
        msp.printArray(arr);
    }
}
