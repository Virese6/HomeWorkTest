package January23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File fileName = new File("C:\\Users\\AIT TR Student\\IdeaProjects\\HomeWork\\src\\January23\\personList.txt");
        Person person = new Person("John",23);
        Person person1 = new Person("Johny",24);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person);
        saveObject(fileName,personList);
    }

    public static void saveObject(File fileName, List<Person> personList) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (Person person : personList) {
                bufferedWriter.write(person.getName() + " : " + person.getAge());
                bufferedWriter.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}