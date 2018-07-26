package pl.gwsoft.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        generateNumbersInList(list,10);
        System.out.println(list);

        list = bubbleSort2(list);
        System.out.println(list);
    }

    private static void generateNumbersInList(List<Integer> list, int j) {
        Random random = new Random();
        for (int i=0; i<j; i++) {
            list.add(random.nextInt(100));
        }

    }

    private static List<Integer> bubbleSort2(List<Integer> list) {
        for (int j=0; j<list.size()-1; j++) {
            for (int i = 0; i < list.size()- 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }
        }
        return list;
        //alternatywa
        //return list.stream().sorted().collect(Collectors.toList());
    }


    private static void bubbleSort(int[] array) {
        for (int j=0; j<array.length/2; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }

    private static void displayTable(int[] array) {
        Arrays.stream(array).forEach(i -> {

        });
    }

}
