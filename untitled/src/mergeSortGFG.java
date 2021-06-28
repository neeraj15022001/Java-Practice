public class mergeSortGFG {
    void merge(int[] arr, int startingIndex, int mid, int endingIndex) {
        int sizeOfArrayOne = (mid - startingIndex + 1);
        int sizeOfArrayTwo = (endingIndex - mid);
        int[] arrayOne = new int[sizeOfArrayOne];
        int[] arrayTwo = new int[sizeOfArrayTwo];

        for (int i = 0; i < sizeOfArrayOne; i++) {
            arrayOne[i] = arr[startingIndex + i];
        }
        for (int i = 0; i < sizeOfArrayTwo; i++) {
            arrayTwo[i] = arr[(mid+1) + i];
        }
        int i = 0, j = 0;
        int k = startingIndex;
        while (i < sizeOfArrayOne && j < sizeOfArrayTwo) {
            if(arrayOne[i] > arrayTwo[j]) {
                arr[k] = arrayTwo[j];
                j++;
            } else {
                arr[k] = arrayOne[i];
                i++;
            }
            k++;
        }

        if(i < sizeOfArrayOne) {
            arr[k] = arrayOne[i];
            i++;
            k++;
        }
        if(j < sizeOfArrayTwo) {
            arr[k] = arrayTwo[j];
            j++;
            k++;
        }
    }
    void mergeSort(int[] arr, int startingIndex, int endingIndex) {
        if (startingIndex >= endingIndex) {
            return;
        }
        int mid = (startingIndex + endingIndex) /2;
        mergeSort(arr, startingIndex, mid);
        mergeSort(arr, mid+1, endingIndex);
        merge(arr,startingIndex,mid,endingIndex);

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
        mergeSortGFG ms  =new mergeSortGFG();
        int[] array = {6,2,20,8,15,3,4};
        int startingIndex = 0;
        int endingIndex = array.length - 1;
        ms.mergeSort(array, startingIndex, endingIndex);
        ms.printArray(array);
    }
}
