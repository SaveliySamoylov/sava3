import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex-1);
            quickSort(arr, partitionIndex+1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 1, 8, 3, 7, 4, 6};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
