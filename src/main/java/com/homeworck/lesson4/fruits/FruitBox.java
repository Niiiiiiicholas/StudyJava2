package com.homeworck.lesson4.fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox <T extends  Fruit>{
    private ArrayList<T> container;
    private float currentWeight;

    public FruitBox() {
        this.container = new ArrayList<>();
    }
    public FruitBox(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }
    public void add(T... fruits){
        this.container.addAll(Arrays.asList(fruits));
    }
    public float getWeight(){
        if(container.size() == 0) {
            return 0.0f;
        }
        return  container.size() * container.get(0).getWeight();
    }
    public boolean compare(FruitBox<?> another){
        return Math.abs(this.getWeight() - another.getWeight())  < 0.0001;
    }
    public  void transfer(FruitBox<? super T> another){
        if(this == another){
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
}
