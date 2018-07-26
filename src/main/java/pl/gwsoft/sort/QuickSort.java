package pl.gwsoft.sort;

public class QuickSort extends SortingAlgorithm {
    private int number;

    public QuickSort(int[] array) {
        super(array);
    }

    public void sort() {
        // check for empty or null array
        if (array == null || array.length == 0) {
            return;
        }
        number = array.length;
        quickSort(0, number - 1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = array[low + (high - low) / 2];

        // Divide into two lists
            while (i <= j) {
                // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (array[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (array[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

}
