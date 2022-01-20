package com.homeworck.lesson1.Animal;

public class Tiger extends Animal{
    public Tiger(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int length) {
        System.out.println("Tigers don't swim");
    }
}
