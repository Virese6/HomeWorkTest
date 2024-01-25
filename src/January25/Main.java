package January25;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task1
        List<String> names = Arrays.asList("John","Marry","John","Ann");
        printNamesWithoutDuplicates(names);
        //Task2
        List<Person> personList = Arrays.asList
                (new Person("John",24,new Address("Post street",23)),
                 new Person("Mark",25, new Address("Madison street",4)),
                 new Person("Marry",15, new Address("Main street",4)));
        printPersons(personList);
    }

    public static void printPersons(List<Person> personList){
        personList.stream()
                .filter(person-> person.age>17)
                .map(person -> person.name +" "+ person.address)
                .forEach(System.out::println);
    }

    public static void printNamesWithoutDuplicates(List<String> names){
        names.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
/*
Задача 1
Написать метод, принимающий лист имен, в котором некоторые имена повторяются
и печатающий имена из листа без печати повторений. При решении использовать Stream API

Задача 2
Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age, Address address.
Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет
 */