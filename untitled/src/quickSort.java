public class quickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        performQuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void performQuickSort(int[] array, int left, int right) {
        System.out.println("Now performing quickSort");
        if (left >= right) {
            System.out.println("Perform empty return as left >= right");
            return;
        }
        int pivot = array[(left + right) / 2];
        System.out.println("pivot: " + pivot + ", right: " + right + ", left: " + left);
        int index = partition(array, left, right, pivot);
        System.out.println("Value of index is " + index);
        System.out.println("Calling performQuickSort function left side");
        performQuickSort(array, left, index - 1);
        System.out.println("Calling performQuickSort function right side");
        performQuickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                System.out.println("Increasing left value");
                left++;
            }
            while (array[right] > pivot) {
                System.out.println("Reducing right value");
                right--;
            }
            if (left <= right) {
                System.out.println("left <= right");
                System.out.println("Now swapping array[left]: " + array[left] + " and array[right]: " + array[right]);
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
