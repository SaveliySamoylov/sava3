import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 1, 8, 3, 7, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

