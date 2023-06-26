import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interactive terminal menu
        System.out.println("==== Search and Sort Algorithms ====");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Quick Sort");
        System.out.println("7. Merge Sort");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performLinearSearch();
                break;
            case 2:
                performBinarySearch();
                break;
            case 3:
                performBubbleSort();
                break;
            case 4:
                performSelectionSort();
                break;
            case 5:
                performInsertionSort();
                break;
            case 6:
                performQuickSort();
                break;
            case 7:
                performMergeSort();
                break;
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    private static void performInsertionSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();
        insertionSort.insertionSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    private static void performQuickSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();
        quickSort.quickSort(array, 0, n - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    private static void performMergeSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array, 0, n - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    private static void performSelectionSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();
        selectionSort.selectionSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    private static void performBubbleSort() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();
        bubbleSort.bubbleSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }

    private static void performBinarySearch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements (in sorted order):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        int result = binarySearch.binarySearch(array, target);
        long endTime = System.currentTimeMillis();

        if (result != -1) {
            System.out.println("Element found at index " + result);
            System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
        } else {
            System.out.println("Element not found");
        }
    }

    private static void performLinearSearch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        int result = linearSearch.linearSearch(array, target);
        long endTime = System.currentTimeMillis();

        if (result != -1) {
            System.out.println("Element found at index " + result);
            System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
        } else {
            System.out.println("Element not found");
        }
    }
}
