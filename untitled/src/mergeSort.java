public class mergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        int leftStart = 0;
        int rightEnd = array.length - 1;
        performMergeSort(array, new int[array.length], leftStart, rightEnd);
        printArray(array);
    }

    public static void performMergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            System.out.println("Returning empty return as left >= right");
            System.out.println("Value of leftStart is " + leftStart + " Value of rightEnd is " + rightEnd);
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        System.out.println("Value of middle is " + middle);
        performMergeSort(array, temp, leftStart, middle);
        performMergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        System.out.println("Value of left: " + left + " leftStart: " + leftStart + " leftEnd: " + leftEnd);
        System.out.println("Value of right: " + right + " rightStart: " + rightStart + " rightEnd: " + rightEnd);
        System.out.println("Value of index: " + index + " Value of size: " + size);
        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
