package pl.gwsoft.stream;

import pl.gwsoft.stream.util.Person;

import java.util.Optional;

public class OptionalTutorial {

    public static void main(String[] args) throws Throwable {
        test6();
    }

    private static void test1() {
        //        Optional<String> emptyOptional = Optional.empty();
        Optional<String> emptyOptional = Optional.of("jakis tekst");
        String text = emptyOptional.orElse("DefaultVAlue");
        System.out.println(text);
    }

    private static void test2() throws Throwable {
        Optional optionalCarNull = Optional.ofNullable(null);
        optionalCarNull.orElseThrow(IllegalStateException::new);
    }

    private static void test3() {
        Optional stringToUse = Optional.of("optional is there");
        if (stringToUse.isPresent()) {
            System.out.println(stringToUse.get());
        }
    }

    private static void test4() {
        Optional stringToUse = Optional.of("optional is there");
        stringToUse.ifPresent(System.out::println);

        Optional stringToUse2 = Optional.empty();
        stringToUse2.ifPresent(System.out::println);
    }

    private static void test5() {
        // non empty string map to its length -> we get the lenght as output (18)
        Optional<String> stringOptional = Optional.of("loooooooong string");
        //map from Optional to Optional
        Optional sizeOptional = stringOptional.map(String::length);
        System.out.println("size of string " + sizeOptional.orElse(0));

        // empty string map to its length -> we get 0 as lenght
        Optional<String> stringOptionalNull = Optional.ofNullable(null);
        // we can use Lambdas as we want
        Optional sizeOptionalNull = stringOptionalNull.map(x -> x.length());
        System.out.println("size of string " + sizeOptionalNull.orElse(0));

    }

    private static void test6() {
        Person person = new Person(15, "Marta");

        // if the value is not present
        Optional<Person> personOptionalEmpty = Optional.of(person);
        personOptionalEmpty
                .filter(p -> p.getAge() > 18)
                .ifPresent(x -> System.out.println(x));



    }
}
