package January26.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Johny", 25);
        Person person3 = new Person("Joe", 23);
        List<Person> personList = Arrays.asList(person1,person2,person3);
        System.out.println(returnResult(personList));
    }

    public static Map<Integer, List<Person>> returnResult(List<Person> personList){
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }
}
/*
Задача 1
Пусть есть класс Person с полями имя и возраст.
Написать метод, принимающий список Person и возвращающий мапу, где возраст является ключом,
а лист людей этого возраста значением

В решении всех задач использовать стримы !
 */