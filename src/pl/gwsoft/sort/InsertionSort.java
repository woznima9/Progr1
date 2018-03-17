package pl.gwsoft.sort;

public class InsertionSort extends SortingAlgorithm {

    public InsertionSort(int[] array) {
        super(array);
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
