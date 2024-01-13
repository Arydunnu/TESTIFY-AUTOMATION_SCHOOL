package JavaCodingChallenge;

public class CountingSort {

    public static void main(String[] args) {
        int[] input = {4, 2, 1, 5, 3, 9, 7, 1, 6, 8, 3, 4, 2, 1, 5, 3, 9, 7, 1, 6, 8};

        System.out.println("Original Array:");
        printArray(input);

        countingSort(input, 1, 9);

        System.out.println("\nSorted Array:");
        printArray(input);
    }

    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count the occurrences of each element
        for (int num : arr) {
            count[num - min]++;
        }

        // Adjust the count array to store the position of elements in the output array
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted array back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}