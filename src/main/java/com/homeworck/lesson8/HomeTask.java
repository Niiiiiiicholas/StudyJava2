package com.homeworck.lesson8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HomeTask {
    public static void main(String[] args) {
//        String[] list = {"Ivan", "Nick", "Ivan", "Nick", " Anna", "Ivan", "Ivan", "Ivan", "Ivan"};
//
//        String s = Arrays.stream(list).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().max(Comparator.comparingLong(e -> e.getValue())).get().getKey();
//        System.out.println(s);

        Person[] person = {new Person("Bob1",23, 40000), new Person("Bob2",23, 50000), new Person("Bob3",33, 60000)};
        System.out.println(Arrays.stream(person).mapToDouble(Person::getSalary).average());

        final int N = 2;
        Arrays.stream(person)
                .sorted((o1, o2) -> o2.age - o1.age)
                .limit(N).map(Person::getName)
                .collect(Collectors.joining(", ", N + " Самых старштх сотрудников: ", "."));
    }
    static class Person{
        private String name;
        private int age;
        private int salary;

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }
    }
}
