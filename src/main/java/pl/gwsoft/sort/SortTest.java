package pl.gwsoft.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

    public static final int SIZE = 20_000;

    private static int[] generateNumbers(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Bubble sort: ");
        int[] array = generateNumbers(SIZE);
        BubbleSorter bs = new BubbleSorter(array);
        long time = System.currentTimeMillis();
        bs.sort();
        System.out.println(System.currentTimeMillis() - time + " ms");
        //Arrays.stream(bs.getArray()).forEach(entry -> System.out.print(entry + " "));

        System.out.println("\nQuick sort: ");
        array = generateNumbers(SIZE);
        QuickSort qs = new QuickSort(array);
        time = System.currentTimeMillis();
        qs.sort();
        System.out.println(System.currentTimeMillis() - time + " ms");
        //Arrays.stream(qs.getArray()).forEach(entry -> System.out.print(entry + " "));

        System.out.println("\nInsertion sort: ");
        array = generateNumbers(SIZE);
        InsertionSort is = new InsertionSort(array);
        time = System.currentTimeMillis();
        is.sort();
        System.out.println(System.currentTimeMillis() - time + " ms");
        //Arrays.stream(is.getArray()).forEach(entry -> System.out.print(entry + " "));

    }
}
