package HomeWork22;

import java.util.*;

public class PersonSuperComparator {

    public static void main(String[] args) {

        Comparator<Person> comparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet(comparator);
        people.add(new Person("Анатолий", 35));
        people.add(new Person("Борис",20));
        people.add(new Person("Пушкевич",30));
        people.add(new Person("Иваныч",25));
        System.out.println("Сортировка пользователей по имени и возрасту: ");

        for(Person  p : people){

            System.out.println(p.getName() + " " + p.getAge()+ " лет");
        }
    }
}