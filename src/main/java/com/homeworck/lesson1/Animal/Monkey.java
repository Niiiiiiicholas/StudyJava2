package com.homeworck.lesson1.Animal;

public class Monkey extends Animal{
    public Monkey(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int length) {
        System.out.println("Monkeys don't swim");
    }

    @Override
    public void run(int length) {
        System.out.println("Monkeys don't run");
    }
}
