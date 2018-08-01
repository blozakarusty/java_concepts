package collections_11;

import java.util.*;
import java.util.stream.*;

import collections_08.GenderType;
import collections_08.Person;

public class StreamApp {

   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();

      Person person1 = new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175);
      Person person2 = new Person("Marge", "Simpson", GenderType.FEMALE,38,65, 170);
      Person person3 = new Person("Bart", "Simpson", GenderType.MALE,10, 30,102);
      Person person4 = new Person("Lisa", "Simpson", GenderType.FEMALE,8, 25,95);
      Person person5 = new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65);
      Person person6 = new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65);
      persons.add(person1);
      persons.add(person2);
      persons.add(person3);
      persons.add(person4);
      persons.add(person5);
      persons.add(person6);

      System.out.println("---All persons---");
      persons.stream().forEach(System.out::println);
      
      System.out.println("---Only women---");
      persons.stream().filter(p -> p.getGender() == GenderType.FEMALE)
                      .forEach(System.out::println);
      
      System.out.println("---Persons younger then 10---");
      persons.stream().filter(p -> p.getAge() < 10)
                      .forEach(System.out::println);
      
      System.out.println("---Persons between 20 and 30 kg---");
      persons.stream().filter(p -> p.getWeight() >20)
                      .filter(p -> p.getWeight() < 30)
                      .forEach(System.out::println);
      
      System.out.println("---Persons older then 30 and weight over 70 kg---");
      persons.stream().filter(p -> p.getAge() >30)
                      .filter(p -> p.getWeight() > 70)
                      .forEach(System.out::println);

      System.out.println("---Firstname + lastname---");
      persons.stream().map(p -> p.getFirstName()+ " " + p.getLastName())
                      .forEach(System.out::println);
      
      System.out.println("---Ages---");
      persons.stream().mapToInt(Person::getAge)
                      .forEach(System.out::println);
      
      System.out.println("---Average age---");
      System.out.println(persons.stream()
                                .mapToInt(Person::getAge)
                                .average()
                                .getAsDouble());
      
      System.out.println("---Minimum age---");
      System.out.println(persons.stream()
                                .mapToInt(Person::getAge)
                                .min()
                                .getAsInt());

      System.out.println("---Maximum age---");
      System.out.println(persons.stream()
                                .mapToInt(Person::getAge)
                                .max()
                                .getAsInt());

      System.out.println("---Weights---");
      persons.stream().mapToDouble(Person::getWeight)
                      .forEach(System.out::println);
      
      System.out.println("---Average weight---");
      System.out.println(persons.stream()
                                .mapToDouble(Person::getWeight)
                                .average()
                                .getAsDouble());
      
      System.out.println("---Minimum weight---");
      System.out.println(persons.stream()
                                 .mapToDouble(Person::getWeight)
                                 .min()
                                 .getAsDouble());

      System.out.println("---Maximum weight---");
      System.out.println(persons.stream()
                                .mapToDouble(Person::getWeight)
                                .max()
                                .getAsDouble());

            
      System.out.println("---Only children---");
      List<Person> children = persons.stream()
                                     .filter(p -> p.getAge() <18)
                                     .collect(Collectors.toList());
      children.stream().forEach(System.out::println);
      
   }

}
