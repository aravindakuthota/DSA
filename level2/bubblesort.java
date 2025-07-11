import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {55, -95, 4, 64, -1, 255, 100};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Fix: j < n - i - 1
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
