import java.util.*;

public class quickSortUsingArrayList {

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                Collections.swap(arr, i, j);
                // OR
                //int temp = arr.get(i);
                //arr.set(i, arr.get(j));
                //arr.set(j, temp);
            }
        }

        Collections.swap(arr, low, j); // Place pivot in correct position
        return j;
    }

    static void quickSortRecursive(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSortRecursive(arr, low, pIndex - 1);
            quickSortRecursive(arr, pIndex + 1, high);
        }
    }

    public static List<Integer> quickSort(List<Integer> arr) {
        quickSortRecursive(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 7, 9, 1, 3));
        System.out.println("Before Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr); // Call QuickSort

        System.out.println("After Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
