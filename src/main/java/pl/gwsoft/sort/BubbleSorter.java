package pl.gwsoft.sort;

public class BubbleSorter extends SortingAlgorithm {

    public BubbleSorter(int[] array) {
        super(array);
    }

    public void sort() {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < (array.length - j - 1); i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }
}
