package com.generics.hira;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Hira", 18,Gender.FEMALE),
                new Person("Reyhane", 20, Gender.FEMALE), new Person("Naran", 25, Gender.MALE),
                new Person("Memo", 25, Gender.MALE), new Person("Gulcin", 25, Gender.FEMALE),
                new Person("Mohammed", 25, Gender.MALE), new Person("Lucy", 25, Gender.FEMALE),
                new Person("Nora", 25, Gender.FEMALE), new Person("Nuria", 25, Gender.FEMALE),
                new Person("Kyoung", 25, Gender.FEMALE));

        System.out.println("Lambda ready methods: predicate");
        Predicate<Person> predicate = person -> person.getGender() == Gender.FEMALE;
        System.out.println(predicate.test(people.get(2)));

        System.out.println("Stream");
        people.stream()
                .filter(person -> person.getAge()<24)
                .map(Person::toString)
                .forEach(System.out::println);

        System.out.println("Stream two");
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        /*
        people.stream()
                .forEach(person->System.out.println(person.getName());
         */
    }
}
