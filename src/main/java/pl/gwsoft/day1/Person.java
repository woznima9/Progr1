package pl.gwsoft.day1;

public class Person implements Comparable {
    private String name;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
//        return this.age - ((Person) o).getAge();
        return this.getSurname().compareTo(((Person) o).getSurname());
    }
}
