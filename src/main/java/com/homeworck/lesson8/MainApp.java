package com.homeworck.lesson8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        Stream.of("AAA", "BBBB", "CCCCC", "D").map((s) -> s.length()).forEach(System.out::println);
        Stream.of(1,2,3,4).map((n) -> n * 10).forEach(System.out::println);
        Stream.of("AAAAAA", "VVV", "OOOOOOOOOOOOOO").map(String::length).collect(Collectors.toList());

        class User{
            String name;

            public User(String name) {
                this.name = name;
            }
        }
        Stream.of("Bob", "Max", "John").map(User::new).collect(Collectors.toList());

//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        List<Integer> out = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).collect(Collectors.toList());
//
//        List<Integer> out2 = list.stream()
//                            .filter((n)-> n % 2 == 0)
//                            .collect(Collectors.toList());
//
//        list.stream().filter((n) -> n % 2 == 1).forEach((n) ->
//                System.out.println(n));
//
//        System.out.println(out2);
//        System.out.println(out);
    }
}
