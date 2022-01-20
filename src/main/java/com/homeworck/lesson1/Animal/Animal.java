package com.homeworck.lesson1.Animal;

public class Animal {
    String name;
    String color;
    int age;
    public static int count;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }
    public void swim(int length){
        System.out.println(name + " пробежал = " + length );
    }
    public void run(int length){
        System.out.println(name + " проплыл = " + length );
    }
    public void info(){
        System.out.println(name + " " + color + " " + age);
    }
}
