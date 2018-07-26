package pl.gwsoft.stream;

import pl.gwsoft.stream.util.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTutorial {

    public static void main(String[] args) {
        testDistinct();
    }

    private static void testDistinct() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(15, "Marta"));
        persons.add(new Person(16, "Adam"));
        persons.add(new Person(18, "Marta"));
        persons.add(new Person(25, "Marta"));
        persons.add(new Person(17, "Marta"));

        persons.stream().map(Person::getName).distinct().forEach(System.out::println);
    }

    private static void testParallelStream() {
        Arrays.asList("a1", "a2", "b1", "b2", "c1", "c2")
                .parallelStream()
                .forEach(System.out::println);
        System.out.println("----------------------");
        Arrays.asList("a1", "a2", "a3", "a4", "a5")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }

    private static void sortingPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(15, "Marta"));
        persons.add(new Person(16, "Adam"));
        persons.add(new Person(18, "Monika"));
        persons.add(new Person(25, "Pawel"));
        persons.add(new Person(17, "Jan"));

        List<Person> sortedAdults = persons.stream()
                .filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
//                .peek(p->p.setName(p.getName() + " ---"))
                .collect(Collectors.toList());
        sortedAdults.forEach(System.out::println);
    }

    private static void groupingPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(15, "Ola"));
        persons.add(new Person(15, "Adam"));
        persons.add(new Person(17, "Jan"));

        Map<Integer, List<Person>> personsByAge = persons
                .stream()
                .collect(Collectors.groupingBy(p -> p.getAge()));

        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

    }

    private static void convertPersonToMap() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(15, "Ola"));
        persons.add(new Person(18, "Adam"));
        persons.add(new Person(17, "Jan"));


        Map<Integer, String> result1 = persons.stream().collect(
                Collectors.toMap(Person::getAge, Person::getName));

        System.out.println(result1);
        Map<Integer, String> result2 = persons.stream().collect(
                Collectors.toMap(key -> key.getAge(), value -> value.getName()));

        System.out.println(result2);

        System.out.println("------------------");
        persons = new ArrayList<>();
        persons.add(new Person(17, "Lukasz"));
        persons.add(new Person(15, "Ola"));
        persons.add(new Person(18, "Adam"));
        persons.add(new Person(17, "Jan"));
        persons.add(new Person(17, "Michal"));
        Map<Integer, String> map = persons
                .stream()
                .collect(Collectors.toMap(
                        p -> p.getAge(),
                        p -> p.getName(),
                        (name1, name2) -> name1 + ";" + name2));

        System.out.println(map);

    }

    private static void convertPersonToStringList() {
        List<Person> p = new ArrayList<>();
        p.add(new Person(15, "Ola"));
        p.add(new Person(18, "Adam"));
        p.add(new Person(17, "Jan"));

        List<String> list = p.stream().map(e -> e.getName()).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static void testJoin() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(10, "Adam"));
        persons.add(new Person(19, "Jan"));
        persons.add(new Person(19, "Ola"));

        String phrase = persons
                .stream()
                .filter(p -> p.getAge() >= 18)
                .map(p -> p.getName())
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

        System.out.println(phrase);
    }

    private static void testMapAndMatch() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }

    private static void testFiltering() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    private static void testMapToObj() {
        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Random random = new Random();
        List<Integer> generatedNumebrs = IntStream.range(1, 4)
                .mapToObj(i -> new Integer(random.nextInt(100)))
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }

    private static void testMapToInt() {
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);  // 3
    }

    private static void testAvarage() {
        IntStream.range(1,5)
                .map(n->n*n)
                .max() //optionalDouble
                .ifPresent(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0
    }

    private static void testStreamAndRange() {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);  // a1

        IntStream.range(1, 5)
                .forEach(System.out::println);
    }


    private static void test1() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        //po staremu przed java 8
        List<String> newList = new ArrayList<>();
        for (String element: myList) {
            if(element.startsWith("c")) {
                newList.add(element.toUpperCase());
            }
        }
        Collections.sort(newList);
        for (String element: newList ) {
            System.out.println(element);
        }

        //w javie 8
        newList = myList.stream()
              .filter(s -> s.startsWith("c"))
              .map(element -> element.toUpperCase())
              .sorted()
              .collect(Collectors.toList());
        newList.stream().forEach(System.out::println);
    }



}
