package January26.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ann", 23);
        Person person2 = new Person("John", 24);
        Person person3 = new Person("Tina", 25);
        Person person4 = new Person("Bill", 17);
        List<Person> persons = Arrays.asList(person1,person2,person3,person4);

        System.out.println(sumAges(persons));

        System.out.println(returnNames(persons));


    }
    public static int sumAges(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getAge()>18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String returnNames(List<Person> personList){
         return "At the moment" + personList.stream()
                .filter(person -> person.getAge()>18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", " ", " are of legal age."));
    }

}
/*
Есть тот же класс Person с полями String name, int age.

Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
"At the moment John and Ann and Bill are of legal age "
( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)

В решении всех задач использовать стримы !
 */