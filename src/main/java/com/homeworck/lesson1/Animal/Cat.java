package com.homeworck.lesson1.Animal;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int length) {
        System.out.println("Cats don't swim");
    }
}
