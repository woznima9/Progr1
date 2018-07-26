package pl.gwsoft.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort2 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 55));
        persons.add(new Person("Kamil", "Nowak", 50));
        persons.add(new Person("Agata", "Nowacka", 34));
        persons.add(new Person("Paweł", "Iksiński", 25));

        List<Person> persons2 = persons.stream().sorted().collect(Collectors.toList());
        printPersonList(persons2);
    }

    private static void printPersonList(List<Person> persons2) {
        persons2.stream().forEach(i->System.out.println(i.getName() + " " + i.getSurname() + " "+i.getAge()));
    }


}
