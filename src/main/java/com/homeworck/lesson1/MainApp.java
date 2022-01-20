package com.homeworck.lesson1;

import com.homeworck.lesson1.Animal.*;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();
        list.add(new Cat("Vasy","White", 12));
        list.add(new Dog("Petya","Black", 1));
        list.add(new Tiger("Nick","Yello", 2));
        list.add(new Monkey("Baks","Wite", 6));

        for(Animal animal : list){
            animal.swim(150);
            animal.run(100);
            animal.info();
        }
        System.out.println("Всего зверей принимало участие в состязении - " + Animal.count);
    }
}
