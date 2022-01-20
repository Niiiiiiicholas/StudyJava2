package com.homeworck.lesson4.fruits;

public class MainApplication {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple());
        FruitBox<Apple> anotherAppleBox = new FruitBox<>(new Apple());
        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange());
        FruitBox<Fruit> fruitBox = new FruitBox<>();

        appleBox.transfer(fruitBox);
        appleBox.transfer(anotherAppleBox);
        appleBox.transfer(fruitBox);
        fruitBox.transfer(fruitBox);
    }
}
