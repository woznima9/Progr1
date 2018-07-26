package pl.gwsoft.sort;

public abstract class SortingAlgorithm {
    protected int[] array;

    abstract void sort();

    public SortingAlgorithm(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    protected void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
