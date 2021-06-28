import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToBeSearched = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
        int start = 0;
        int end = size - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            System.out.println("Loop Starting");
            if (arr[mid] == numberToBeSearched) {
                System.out.println("Number Found");
                break;
            } else {
                System.out.println("in else condition");
                if (numberToBeSearched > arr[mid]) {
                    start = mid + 1;
                    mid = (start + end) / 2;

                } else {
                    end = mid - 1;
                    mid = (start + end) / 2;
                }
            }
            System.out.println("start: " + start + ", end : " + end + ", mid " + mid);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
