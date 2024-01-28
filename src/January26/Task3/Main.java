package January26.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str1 = "aaaaaaa cccc ab bbbbb a ff aaa";
        String str2 = "aaaa";

        System.out.println(returnNumberOfStrings(str1,str2));
    }

    public static int returnNumberOfStrings(String str1, String str2){
        String [] strings = str1.split(" ");
        return (int) Arrays.stream(strings)
                .filter(s -> s.startsWith(str2))
                .count();
    }
}
/*
Написать метод, принимающий в качестве параметров две строки.
Первая строка состоит из слов, разделенных пробелом.
 Метод возвращает количество слов первой строки, начинающихся со второй строки
Пример: Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1

В решении всех задач использовать стримы !
 */